package com.gyf.szcrm.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class add {
    private String data;
    public void setData(String data){
        this.data=data;
    }
    public String getData(){
        return data;
    }

}


