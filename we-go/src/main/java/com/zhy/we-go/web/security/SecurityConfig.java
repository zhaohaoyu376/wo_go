package com.gyf.szcrm.web.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected  void configure (HttpSecurity http) throws  Exception{

        http.headers()
                .frameOptions().sameOrigin()
                .httpStrictTransportSecurity().disable();


        http.authorizeRequests()

//                .antMatchers("/courseorder/list").hasAnyAuthority("READ")
//                .antMatchers("/courseorder/detail").hasAnyAuthority("READ")
//                .antMatchers("/courseorder/edit").hasAnyAuthority("READ")
//                .antMatchers("/courseorder/add").hasAnyAuthority("READ")

                .antMatchers("/log/login").permitAll()
//                .antMatchers("/user/**").hasRole("USER")
                .antMatchers("/**").fullyAuthenticated()
                .and()
                .formLogin()
                .loginPage("/log/login");
//                .failureUrl("/log/login-error");
    }


}
