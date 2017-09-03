package com.szl.demo.spring.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;
	@Resource
	private Home home;

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public Integer getAge() {
		return age;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean will destroy now.");
	}
}
