package com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
     @Id
	int rollno;
     @Column
	String name;
     @Column
	String email;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int rollno, String name, String email) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
	}
	public Student() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + "]";
	}
	
}
