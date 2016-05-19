package com.wladek.pktcard.service;

import com.wladek.pktcard.domain.User;
import com.wladek.pktcard.domain.enumeration.UserRole;
import com.wladek.pktcard.domain.enumeration.UserState;
import com.wladek.pktcard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Keeun Baik
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public User addNewUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        if(user.getUserState() == null){
            user.setUserState(UserState.ACTIVE);
        }

        if (user.getUserRole() == null){
            user.setUserRole(UserRole.ADMIN);
        }

        User newUser = repository.save(user);

        return newUser;
    }

    @Override
    public void login(User user) {
        UserDetailsImpl ud = new UserDetailsImpl(user);
        Authentication authentication = new UsernamePasswordAuthenticationToken(ud, ud.getPassword(), ud.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findByRole(UserRole userRole) {
        return repository.findByUserRole(userRole);
    }
}
