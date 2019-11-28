package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.springcore.di.Hello;

@Configuration
@Import(PetConfigurationClass.class)
public class HelloConfigurationClass {


	@Bean(name = "hello")//same as bean.xml
//	@Scope("prototype")//it creates new objects everytime when you call this method  
	public Hello getHello() {//factory class
		Hello hello = new Hello();
		hello.setMsg("I Love Python");
		return hello;
	}
}
