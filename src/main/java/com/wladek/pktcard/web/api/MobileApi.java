package com.wladek.pktcard.web.api;

import com.wladek.pktcard.pojo.LogInApp;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wladek on 8/3/16.
 */

@RestController
@RequestMapping(value = "/api")
public class MobileApi {

    @RequestMapping(value = "/test" , method = RequestMethod.POST , produces = "application/json", consumes = "application/json")
    @ResponseBody
    public LogInApp testLogin(@RequestBody LogInApp logInApp){
        return logInApp;
    }
}