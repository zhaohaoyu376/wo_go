package com.gyf.szcrm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("logg")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("70周年国庆");
        return "index";
    }
}
