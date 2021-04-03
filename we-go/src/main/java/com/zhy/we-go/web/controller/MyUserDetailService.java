package com.gyf.szcrm.web.controller;

import com.gyf.szcrm.model.User;
import com.gyf.szcrm.service.IUSerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyUserDetailService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private IUSerService iuserService;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//        System.out.println(username);
//        com.gyf.szcrm.model.User dbUser = iuserService.findByUserName(username);
//
//        if (dbUser == null){
//            return null;
//        }
//
//        String pwd = passwordEncoder.encode(dbUser.getPassword());
//
//        return null;
//
//    }
}
