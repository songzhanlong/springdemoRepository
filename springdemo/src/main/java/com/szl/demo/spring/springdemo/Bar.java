package com.szl.demo.spring.springdemo;

public class Bar {
	private String message;

	public String getMessage() {
		System.out.println("bar's message=" + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Bar(String message) {
		super();
		this.message = message;
	}

}
