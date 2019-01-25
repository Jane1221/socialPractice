package com.example.socialPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String getIntroducePage(){
        return "test";
    }
}
