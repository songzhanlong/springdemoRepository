package com.szl.demo.spring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HiConfig {
	@Bean(initMethod = "init", destroyMethod = "clearup")
	@Scope("prototype")
	public Car car() {
		Car car = new Car();
		return car;
	}
}
