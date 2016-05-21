package com.wladek.pktcard.repository;

import com.wladek.pktcard.domain.Item;
import com.wladek.pktcard.domain.School;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wladek on 5/17/16.
 */
@Repository
public interface ItemRepo extends JpaRepository<Item , Long>{
    Page<Item> findBySchool(Pageable pageable , School school);
}
