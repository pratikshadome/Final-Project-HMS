package com.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Books1
{
	@Value("mrutunjay")
    private String name;
	@Value("200")
    private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [name=" + name + ", price=" + price + "]";
	}
	public Books1(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Books1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
