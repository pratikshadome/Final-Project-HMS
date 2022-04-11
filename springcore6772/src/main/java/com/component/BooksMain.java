package com.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.collection.Employee;

public class BooksMain {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/component/booksconfig.xml");
		Books1 b = context.getBean(Books1.class,"books");
		System.out.println(b);
	}

}
