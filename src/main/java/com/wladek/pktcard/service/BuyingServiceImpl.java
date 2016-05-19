package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Buying;
import com.wladek.pktcard.repository.BuyingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
@Service
public class BuyingServiceImpl implements BuyingService{

    @Autowired
    BuyingRepo buyingRepo;

    @Override
    public Buying makeBuy(Buying buying) {
        return buyingRepo.save(buying);
    }

    @Override
    public Buying getBuy(Long id) {
        return buyingRepo.getOne(id);
    }

    @Override
    public List<Buying> getAll() {
        return buyingRepo.findAll();
    }
}
