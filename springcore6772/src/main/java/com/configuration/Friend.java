package com.configuration;

public class Friend
{
       private String name;
       private String age;
       private String contact;
	public Friend(String name, String age, String contact) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
       
       
}
