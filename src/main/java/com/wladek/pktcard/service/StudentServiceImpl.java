package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.Student;
import com.wladek.pktcard.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wladek on 5/17/16.
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;
    @Override
    public Student create(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getOne(Long id) {
        return studentRepo.getOne(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}
