package com.wladek.pktcard.web.admin;

import com.wladek.pktcard.domain.School;
import com.wladek.pktcard.domain.User;
import com.wladek.pktcard.domain.enumeration.UserRole;
import com.wladek.pktcard.domain.enumeration.UserState;
import com.wladek.pktcard.service.SchoolService;
import com.wladek.pktcard.service.UserService;
import com.wladek.pktcard.web.front.support.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @Autowired
    SchoolService schoolService;

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

    @RequestMapping(value = "/users/createUser" , method = RequestMethod.POST)
    public String postUser(@ModelAttribute @Valid User user, BindingResult result ,
                           RedirectAttributes redirectAttributes , Model model){

        userValidator.validateNewUser(user, result);

        if(result.hasErrors()) {

            List<User> users = userService.findByRole(UserRole.USER);

            System.out.print(" RESULTS "+result.toString());

            model.addAttribute("message" , true);
            model.addAttribute("content" , "Form has errors");
            model.addAttribute("users" , users);
            model.addAttribute("user" , user);

            return "/admin/users/index";
        }

        user.setPassword("pass");
        user.setUserRole(UserRole.USER);
        user.setUserState(UserState.IN_ACTIVE);
        User newUser = userService.addNewUser(user);

        redirectAttributes.addAttribute("message" , true);
        redirectAttributes.addFlashAttribute("content" , newUser.getName() + " added");

        return "redirect:/admin/users";
    }

    @RequestMapping(value = "/school" , method = RequestMethod.GET)
    public String listSchool(@RequestParam(value = "page" , required = false , defaultValue = "1") int page,
                             @RequestParam(value = "size" , required = false , defaultValue = "10") int size,Model model){

        Page<School> schoolPage = schoolService.getAll(page, size);

        model.addAttribute("schoolPage" , schoolPage);
        model.addAttribute("school" , new School());
        model.addAttribute("pagenatedUrl" , "/admin/schools");

        return "/admin/users/schools";
    }

    @RequestMapping(value = "/school/createSchool" , method = RequestMethod.POST)
    public String postSchool(@ModelAttribute @Valid School school , BindingResult result, RedirectAttributes redirectAttributes,
                             @RequestParam(value = "page" , required = false , defaultValue = "1") int page,
                             @RequestParam(value = "size" , required = false , defaultValue = "10") int size,Model model){

        if (result.hasErrors()){

            Page<School> schoolPage = schoolService.getAll(page, size);

            model.addAttribute("schoolPage" , schoolPage);
            model.addAttribute("school" , school);
            model.addAttribute("message" , true);
            model.addAttribute("content" , "Form has errors, Click add school button to view");
            model.addAttribute("pagenatedUrl" , "/admin/schools");

            return "/admin/users/schools";
        }

        schoolService.create(school);
        redirectAttributes.addFlashAttribute("message" , true);
        redirectAttributes.addFlashAttribute("content" , " School created ");
        return "redirect:/admin/school";
    }
}
