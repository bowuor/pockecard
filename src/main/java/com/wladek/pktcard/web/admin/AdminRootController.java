package com.wladek.pktcard.web.admin;

import com.wladek.pktcard.domain.User;
import com.wladek.pktcard.domain.enumeration.UserRole;
import com.wladek.pktcard.service.UserService;
import com.wladek.pktcard.web.front.support.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by wladek on 5/19/16.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminRootController {
    @Autowired
    UserValidator userValidator;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    public String adminRoot(){

        return "/admin/index";
    }

    @RequestMapping(value = "/users" , method = RequestMethod.GET)
    public String listUsers(Model model){

        List<User> users = userService.findByRole(UserRole.USER);

        model.addAttribute("users" , users);
        model.addAttribute("user" , new User());

        return "/admin/users/index";
    }

    @RequestMapping(value = "/users" , method = RequestMethod.POST)
    public String postUser(@ModelAttribute @Valid User user, BindingResult result , Model model){

        List<User> users = userService.findByRole(UserRole.USER);

        userValidator.validateNewUser(user, result);

        if(result.hasErrors()) {

            model.addAttribute("users" , users);
            model.addAttribute("user" , user);

            return "/admin/users/index";
        }

        user.setPassword("pass");
        User newUser = userService.addNewUser(user);
        userService.login(newUser);
        return "redirect:/";
    }
}
