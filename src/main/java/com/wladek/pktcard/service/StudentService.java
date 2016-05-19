package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Student;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
public interface StudentService {
    public Student create(Student student);
    public Student getOne(Long id);
    public List<Student> findAll();
}
