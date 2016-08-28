package com.wladek.pktcard.web.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ben on 07-Jul-16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String getHomepage(){
        return "/index";
    }

    @RequestMapping(value = "/privacy" , method = RequestMethod.GET)
    public String getPrivacypage(){
        return "/privacy";
    }

    @RequestMapping(value = "/faq" , method = RequestMethod.GET)
    public String getFaqpage() {
        return "/faq";
    }

}
