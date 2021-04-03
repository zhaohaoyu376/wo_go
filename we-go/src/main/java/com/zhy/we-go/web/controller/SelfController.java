package com.gyf.szcrm.web.controller;

import com.gyf.szcrm.model.MonthIncome;
import com.gyf.szcrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("self")
public class SelfController {

    @Autowired
    ICourseOrderService orderService;

    @RequestMapping("self")
    public String self(){
        return "self/self";
    }

    @RequestMapping("change")
    public String change(){
        return "self/change";
    }

    @RequestMapping("infor")
    public String infor(){
        return "self/infor";
    }

    @RequestMapping("icon")
    public String icon(){
        return "self/icon";
    }
}
