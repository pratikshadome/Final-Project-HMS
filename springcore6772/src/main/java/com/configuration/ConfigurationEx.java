package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.configuration")
public class ConfigurationEx 
{
	@Bean
     public Friend getFriend()
     {
    	 Friend obj = new Friend("ram","10","56789034");
    	 return obj;
     }
}
