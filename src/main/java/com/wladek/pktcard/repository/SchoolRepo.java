package com.wladek.pktcard.repository;

import com.wladek.pktcard.domain.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wladek on 5/17/16.
 */
@Repository
public interface SchoolRepo extends JpaRepository<School, Long>{
    public School findByCode(String code);
}
