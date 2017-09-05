package com.szl.demo.spring.springdemo;

public class Car {
	private String message;

	public String getMessage() {
		System.out.println("foo>bar.message=" + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		message = "car.init";
	}

	public void clearup() {
		message = null;
		System.out.println("car.clearup message=" + message);
	}
}
