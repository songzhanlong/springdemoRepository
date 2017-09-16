package com.szl.demo.spring.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String configPath = "beans.xml";
		runBeanFactory(configPath);
		runClassPathXmlApplicationContext(configPath);
		// mac上只能用相对该项目根目录的PATH，window系统中可以从磁盘根目录的路径如d:/...
		configPath = "/src/main/resource/beans.xml";
		runFileSystemXmlApplicationContext(configPath);
	}

	private static void runBeanFactory(String configPath) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(configPath));
		HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
		System.out.println(helloWorld.getMessage());
	}

	private static void runClassPathXmlApplicationContext(String configPath) {
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		System.out.println("----Listing Record with ID = 2 -----");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());
	}

	private static void runFileSystemXmlApplicationContext(String configPath) {
		ApplicationContext context = new FileSystemXmlApplicationContext(configPath);
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld.getMessage());
	}
}
