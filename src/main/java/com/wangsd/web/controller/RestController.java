package com.wangsd.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class RestController {

    @RequestMapping("/getInfo")
    @ResponseBody
    public String getInfo(){
        return "wangsd";
    }
}
