package com.wladek.pktcard.repository;

import com.wladek.pktcard.domain.User;
import com.wladek.pktcard.domain.enumeration.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wladek
 */
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

    User findByLoginId(String loginId);

    User findByEmail(String email);

    List<User> findByUserRole(UserRole userRole);
}
