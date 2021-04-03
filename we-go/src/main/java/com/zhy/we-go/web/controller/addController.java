package com.gyf.szcrm.web.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RequestMapping("/add")
//@Controller
//public class addController {
//
////    @ResponseBody
////    @PostMapping("/add")
////    public Integer getInteger(@RequestBody JSONObject jsonObject){
////
////        String a=jsonObject.get(“data”).toString();
////        Integer data=Integer.parseInt(a);
////        return data;
////    }
//
//}

@RestController

public class addController {
    @PostMapping("/hello")
    public String hello(@RequestParam("name") String name,
                        @RequestParam("age") Integer age) {
        return "name：" + name + "\nage：" + age;
    }

}


