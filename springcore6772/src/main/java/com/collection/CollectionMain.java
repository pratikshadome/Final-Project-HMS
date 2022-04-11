package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student99;

public class CollectionMain {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/configcollection.xml");
		Employee employee = context.getBean(Employee.class,"employee");
		System.out.println(employee.getEmpid());
		System.out.println(employee.getHobbies());
		System.out.println(employee.getContact());
		System.out.println(employee.getAddress());
	
		

	}

}
