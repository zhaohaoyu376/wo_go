package com.gyf.szcrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.File;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.gyf.szcrm"})
@MapperScan(basePackages={"com.gyf.szcrm.mapper"})//扫描Mapper
public class SzcrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzcrmApplication.class, args);
	}

	@Bean
	public PasswordEncoder createPwdEncoder(){
		return new BCryptPasswordEncoder();
	}

}
