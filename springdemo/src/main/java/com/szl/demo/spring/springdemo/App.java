package com.szl.demo.spring.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		runAnatationConfigApplicationContext();
	}

	private static void runAnatationConfigApplicationContext() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.setMessage("hi");
		System.out.println(helloWorld.getMessage());
		Foo foo = (Foo) context.getBean("foo");
		foo.getMessage();
		Car car = (Car) context.getBean("car");
		System.out.println(car.getMessage());
		car.setMessage("car anything");
		System.out.println(car.getMessage());
		car = (Car) context.getBean("car");
		System.out.println(car.getMessage());
		context.registerShutdownHook();

	}

	private static void runBeanFactory(String configPath) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(configPath));
		HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
		System.out.println(helloWorld.getMessage());
	}

	private static void runClassPathXmlApplicationContext(String configPath) {
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld.getMessage());
	}

	private static void runFileSystemXmlApplicationContext(String configPath) {
		ApplicationContext context = new FileSystemXmlApplicationContext(configPath);
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld.getMessage());
	}
}
