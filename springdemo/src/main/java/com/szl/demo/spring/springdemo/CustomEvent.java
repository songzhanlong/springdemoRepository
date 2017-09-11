package com.szl.demo.spring.springdemo;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	/**
	 *
	 */
	private static final long serialVersionUID = -3175594717590144948L;

	@Override
	public String toString() {
		return "My Custom Event";
	}

}
