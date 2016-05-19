package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.School;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
public interface SchoolService {
    public School create(School school);
    public School getOne(Long id);
    public List<School> getAll();
}
