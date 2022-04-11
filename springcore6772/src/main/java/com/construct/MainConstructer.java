package com.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructer {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/construct/configconst.xml");
		Laptop laptop=context.getBean(Laptop.class,"lap");
		System.out.println(laptop);
	}

}
