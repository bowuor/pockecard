package com.wladek.pktcard.web.api;

import com.wladek.pktcard.domain.Item;
import com.wladek.pktcard.pojo.ItemDto;
import com.wladek.pktcard.pojo.LoginDetails;
import com.wladek.pktcard.pojo.SchoolDetails;
import com.wladek.pktcard.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wladek on 8/3/16.
 */

@RestController
@RequestMapping(value = "/api")
public class MobileApi {

    @Autowired
    SchoolService schoolService;

    @RequestMapping(value = "/school_login" , produces = "application/json", consumes = "application/json")
    @ResponseBody
    public SchoolDetails loginSchool(@RequestBody LoginDetails loginDetails){
        return schoolService.authSchoolAdmin(loginDetails);
    }

    @RequestMapping(value = "/school_details" , produces = "application/json", consumes = "application/json")
    @ResponseBody
    public SchoolDetails getSchoolDetails(@RequestBody SchoolDetails schoolDetails){
        return schoolService.getBySchoolCode(schoolDetails);
    }

    @RequestMapping(value = "/school_items/{schoolCode}" , produces = "application/json" , method = RequestMethod.GET)
    @ResponseBody
    public List<ItemDto> getSchoolItems(@PathVariable("schoolCode") String schoolCode){
        return schoolService.getSchoolItems(schoolCode);
    }
}