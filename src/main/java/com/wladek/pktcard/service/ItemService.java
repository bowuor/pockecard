package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Item;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
public interface ItemService {
    public Item create(Item item);
    public Item getOne(Long id);
    public List<Item> listItems();
}
