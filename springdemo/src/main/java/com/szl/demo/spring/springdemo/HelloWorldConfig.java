package com.szl.demo.spring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(HiConfig.class)
public class HelloWorldConfig {
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

	@Bean
	public Foo foo() {
		return new Foo(bar());
	}

	@Bean
	public Bar bar() {
		String message = "hi bar";
		return new Bar(message);
	}
}
