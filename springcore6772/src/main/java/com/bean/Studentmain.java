package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Studentmain {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student99 student = (Student99)context.getBean("stud");
		
		Student99 student1 = (Student99)context.getBean("stud1");
		
		Student99 student2 = (Student99)context.getBean("stud2");
		
		System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
	}

}
