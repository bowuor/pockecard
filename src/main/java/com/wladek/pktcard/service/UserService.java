package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.User;
import com.wladek.pktcard.domain.enumeration.UserRole;

import java.util.List;

/**
 * @author wladek
 */
public interface UserService {

    User addNewUser(User user);

    void login(User user);

    public List<User> findAll();

    public List<User> findByRole(UserRole userRole);
}
