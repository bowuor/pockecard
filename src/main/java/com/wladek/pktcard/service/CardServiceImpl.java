package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Buying;
import com.wladek.pktcard.domain.Card;
import com.wladek.pktcard.domain.CardTransaction;
import com.wladek.pktcard.domain.Item;
import com.wladek.pktcard.domain.enumeration.TransactionType;
import com.wladek.pktcard.pojo.CartItemDto;
import com.wladek.pktcard.repository.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
@Service
@Transactional
public class CardServiceImpl implements CardService {
    @Autowired
    CardRepo cardRepo;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    CardTrxService cardTrxService;
    @Autowired
    ItemService itemService;
    @Autowired
    BuyingService buyingService;

    @Override
    public Card create(Card card) {
        return cardRepo.save(card);
    }

    @Override
    public Card getOne(Long id) {
        return cardRepo.getOne(id);
    }

    @Override
    public List<Card> findAll() {
        return cardRepo.findAll();
    }

    @Override
    public Boolean validateCard(String cardNo, String pin) {
        Card studentCard = findByCardNumber(cardNo);
        return passwordEncoder.matches(pin, studentCard.getPin());
    }

    @Override
    public Card findByCardNumber(String cardNo) {
        return cardRepo.findByCardNo(cardNo);
    }

    @Override
    public int recordBuyingTransaction(String cardNo, List<CartItemDto> cartItems, BigDecimal totalAmount) {

        Card studentCard = findByCardNumber(cardNo);

        int commit = 0;

        CardTransaction cardTransaction = new CardTransaction();
        cardTransaction.setCardNumber(cardNo);
        cardTransaction.setCard(studentCard);
        cardTransaction.setType(TransactionType.TRX_BUY);
        cardTransaction.setAmount(totalAmount);

        CardTransaction trx = cardTrxService.makeTrx(cardTransaction);

        if (trx != null) {
            commit = 1;
        }

        /**
         * Record each item's transaction
         */
        if (commit == 1) {
            commit = recordItemTrx(cartItems, studentCard);
        }

        return commit;
    }

    private int recordItemTrx(List<CartItemDto> cartItems, Card studentCard) {

        int commit = 0;

        for (int i = 0; i < cartItems.size(); i++) {

            CartItemDto itemDto = cartItems.get(i);

            Buying buying = new Buying();

            try {

                Item currentItem = itemService.findByCode(itemDto.getCode());

                buying.setCard(studentCard);
                buying.setUnitPrice(itemDto.getUnitPrice());
                buying.setQuantity(itemDto.getCartQuantity());
                buying.setCardNo(studentCard.getCardNo());
                buying.setTotalAmount(itemDto.getTotalCartValue());
                buying.setItem(currentItem);

                buying = buyingService.makeBuy(buying);

                if (buying != null) {
                    commit = 1;
                }

            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (commit == 1) {
            debitCard(studentCard, cartItems);
        } else {
            return 0;
        }


        return commit;
    }

    private void debitCard(Card studentCard, List<CartItemDto> cartItems) {

        studentCard = getOne(studentCard.getId());

        BigDecimal currentBalance = studentCard.getBalance();
        BigDecimal totalValue = BigDecimal.ZERO;

        try {

            for (int i = 0; i < cartItems.size(); i++) {
                CartItemDto item = cartItems.get(i);
                totalValue = totalValue.add(item.getTotalCartValue());
            }

            studentCard.setBalance(currentBalance.subtract(totalValue));

            cardRepo.save(studentCard);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
