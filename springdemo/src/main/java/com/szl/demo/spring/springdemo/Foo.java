package com.szl.demo.spring.springdemo;

public class Foo {
	private String message;

	public String getMessage() {
		System.out.println("foo>bar.message=" + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Foo(Bar bar) {
		super();
		this.message = bar.getMessage();
	}

}
