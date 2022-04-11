package com.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class configurationMain {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationEx.class);
            Friend friend=(Friend)context.getBean("getFriend");
            System.out.println(friend);
	}

}
