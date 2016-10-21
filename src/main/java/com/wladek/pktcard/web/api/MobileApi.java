package com.wladek.pktcard.web.api;

import com.wladek.pktcard.pojo.*;
import com.wladek.pktcard.service.SchoolService;
import com.wladek.pktcard.service.StudentService;
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
    @Autowired
    StudentService studentService;

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
    public ItemDto[] getSchoolItems(@PathVariable("schoolCode") String schoolCode){
        List<ItemDto> itemDtos = schoolService.getSchoolItems(schoolCode);
        ItemDto[] itemArray = new ItemDto[itemDtos.size()];
        return itemDtos.toArray(itemArray);
    }

    @RequestMapping(value = "/student_checkout" , produces = "application/json" , method = RequestMethod.GET)
    @ResponseBody
    public CheckOutResponse checkout(@RequestBody CheckOutDetails checkOutDetails){
        CheckOutResponse response = schoolService.checkOut(checkOutDetails);
        return response;
    }
}