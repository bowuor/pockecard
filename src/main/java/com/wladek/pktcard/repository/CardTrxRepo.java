package com.wladek.pktcard.repository;

import com.wladek.pktcard.domain.CardTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wladek on 5/17/16.
 */
@Repository
public interface CardTrxRepo extends JpaRepository<CardTransaction , Long>{
}
