package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.School;
import com.wladek.pktcard.repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
@Service
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    SchoolRepo schoolRepo;

    @Override
    public School create(School school) {
        return schoolRepo.save(school);
    }

    @Override
    public School getOne(Long id) {
        return schoolRepo.findOne(id);
    }

    @Override
    public List<School> getAll() {
        return schoolRepo.findAll();
    }
}
