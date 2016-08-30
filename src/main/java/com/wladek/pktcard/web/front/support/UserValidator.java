package com.wladek.pktcard.web.front.support;

import com.wladek.pktcard.domain.User;
import com.wladek.pktcard.domain.enumeration.UserRole;
import com.wladek.pktcard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * @author wladek
 */
@Component
public class UserValidator {

    @Autowired
    UserRepository repository;

    public boolean validateNewUser(User user, BindingResult result) {
        User existingUser = repository.findByEmail(user.getEmail());
        if(existingUser != null) {
            result.rejectValue("email", "user.email.duplicate", "Email already registered, try another one.");
        }

        existingUser = repository.findByLoginId(user.getLoginId());
        if(existingUser != null) {
            result.rejectValue("loginId", "user.loginId.duplicate", "Username already registered, try another one.");
        }

        List<User> users = repository.findByUserRole(UserRole.ADMIN);

        if (users.size() > 0){
            result.rejectValue("loginId", "user.loginId.duplicate", "Illegal sign up");
        }

        return result.hasErrors();
    }
}
