package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Yogi on 2016/8/18.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hi,spring boot!";
    }
}
