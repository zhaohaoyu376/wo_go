package com.gyf.szcrm.web.controller;

import com.gyf.szcrm.model.MonthIncome;
import com.gyf.szcrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("log")
public class LogController {

    @Autowired
    ICourseOrderService orderService;

    @RequestMapping("login")
    public String login(){
        return "log/login";
    }

    @RequestMapping("login-error")
    public String login_error(){
        return "log/login_error";
    }

}
