package com.collection;
import java.util.*;
public class Employee 
{
    private int empid;
    private List<String>hobbies;
    private Set<String>contact;
    private Map<String,Double>mobile;
    
    private Address address;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public Set<String> getContact() {
		return contact;
	}

	public void setContact(Set<String> contact) {
		this.contact = contact;
	}

	public Map<String, Double> getMobile() {
		return mobile;
	}

	public void setMobile(Map<String, Double> mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", hobbies=" + hobbies + ", contact=" + contact + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

	public Employee(int empid, List<String> hobbies, Set<String> contact, Map<String, Double> mobile, Address address) {
		super();
		this.empid = empid;
		this.hobbies = hobbies;
		this.contact = contact;
		this.mobile = mobile;
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
    
    
    
    
    
    
    
}
