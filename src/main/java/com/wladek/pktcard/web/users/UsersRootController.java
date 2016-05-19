package com.wladek.pktcard.web.users;

import com.wladek.pktcard.domain.Student;
import com.wladek.pktcard.domain.User;
import com.wladek.pktcard.service.StudentService;
import com.wladek.pktcard.service.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by wladek on 5/19/16.
 */
@Controller
@RequestMapping(value = "/users")
public class UsersRootController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    public String userRoot(Model model){
        return "/users/index";
    }

    @RequestMapping(value = "/school" , method = RequestMethod.GET)
    public String school(Model model){
        return "/users/index";
    }

    @RequestMapping(value = "/student" , method = RequestMethod.GET)
    public String students(@RequestParam(value = "page" , required = false , defaultValue = "1") int page,
                           @RequestParam(value = "size" , required = false , defaultValue = "10") int size,
                           Model model){

        Page<Student> studentPage = studentService.findBySchool(page , size , getLogInUser().getSchool());

        model.addAttribute("student" , new Student());
        model.addAttribute("studentPage" , studentPage);
        model.addAttribute("pagenatedUrl" , "/users/student");

        return "/users/students";
    }

    @RequestMapping(value = "/student/createStudent" , method = RequestMethod.POST)
    public String postStudent(@ModelAttribute @Valid Student student , BindingResult  bindingResult ,
                              @RequestParam(value = "page" , required = false , defaultValue = "1") int page,
                              @RequestParam(value = "size" , required = false , defaultValue = "10") int size,
                              RedirectAttributes redirectAttributes, Model model){

        if(bindingResult.hasErrors()){
            Page<Student> studentPage = studentService.findBySchool(page, size, getLogInUser().getSchool());

            model.addAttribute("student" , student);
            model.addAttribute("studentPage" , studentPage);
            model.addAttribute("pagenatedUrl" , "/users/student");
            model.addAttribute("message" , true);
            model.addAttribute("content" , "form has error, click add student to view");

            return "/users/students";
        }

        student.setSchool(getLogInUser().getSchool());

        studentService.create(student);

        redirectAttributes.addFlashAttribute("message" ,true);
        redirectAttributes.addFlashAttribute("content" , " Student created ");

        return "/users/students";
    }

    private User getLogInUser(){

        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return userDetails.getUser();
    }
}
