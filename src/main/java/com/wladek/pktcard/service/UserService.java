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

    public User findById(Long id);

    public void setSchool(User user);

    public User activateUser(Long id);

    public User deActivateUser(Long id);

    public User findByLoginIdOrEmail(String loginId);
}
