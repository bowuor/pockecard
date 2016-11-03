package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Item;
import com.wladek.pktcard.domain.School;
import com.wladek.pktcard.pojo.*;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
public interface SchoolService {
    public School create(School school);
    public School getOne(Long id);
    public List<School> getAll();
    public Page<School> getAll(int page , int size);
    public SchoolDetails getBySchoolCode(SchoolDetails schoolDetails);
    public SchoolDetails authSchoolAdmin(LoginDetails loginDetails);
    public List<ItemDto> getSchoolItems(String schoolCode);
    public CheckOutResponse checkOut(CheckOutDetails checkOutDetails);
}
