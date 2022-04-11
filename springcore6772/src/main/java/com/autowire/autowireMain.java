package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.construct.Laptop;

public class autowireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/autowireconfig.xml");
		context.registerShutdownHook();
		Student s = (Student) context.getBean("student");
		System.out.println(s);
		
	
	}

}
