package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Item;
import com.wladek.pktcard.domain.School;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
public interface ItemService {
    public Item create(Item item);
    public Item getOne(Long id);
    public List<Item> listItems();
    public Page<Item> findBySchool(School school , int page , int size);
    public List<Item> findBySchool(School school);
    public void delete(Long id);
}
