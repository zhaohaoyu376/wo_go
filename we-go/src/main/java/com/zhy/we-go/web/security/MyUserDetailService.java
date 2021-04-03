package com.gyf.szcrm.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Configuration
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws  UsernameNotFoundException{
        System.out.println(username);
        String pwd = passwordEncoder.encode("12345");
        System.out.println(pwd);
        return new User(
                username,
                passwordEncoder.encode("12345"),
                AuthorityUtils.commaSeparatedStringToAuthorityList("USER"));
    }

    public Collection<? extends GrantedAuthority> getCurrentUserAuthorities(){
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
        list.add(new SimpleGrantedAuthority("READ"));
        list.add(new SimpleGrantedAuthority("DELETE"));
        list.add(new SimpleGrantedAuthority("ADD"));
        return list;
    }
}
