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
		// runBeanFactory(configPath);
		// runClassPathXmlApplicationContext(configPath);
		// mac上只能用相对该项目根目录的PATH，window系统中可以从磁盘根目录的路径如d:/...
		// configPath = "/src/main/resource/beans.xml";
		// runFileSystemXmlApplicationContext(configPath);
		runLazyBean(configPath);
	}

	private static void runLazyBean(String configPath) {
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		LazyBean lazyBean = (LazyBean) context.getBean("lazyBean");
		lazyBean.doAnything();
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
