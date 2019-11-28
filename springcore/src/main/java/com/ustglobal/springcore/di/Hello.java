package com.ustglobal.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//Springs-life cycle
@Component("hello")
public class Hello {
	
	public Hello() {
		System.out.println("Hello Object Created");//instatiation phase
	}
	private String msg;
	
	private Map<String,Integer> map;

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public String getMsg() {//usage of Bean
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@PostConstruct
	public void init() {//init phase
		System.out.println("init() method is Executing from Hello");
	}
	@PreDestroy
	public void destroy() {//destroy phase
		System.out.println("destroy() method is Executing from Hello");
	}
	
}
