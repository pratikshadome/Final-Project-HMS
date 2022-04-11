

package com.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
     private int studentid;
     private String studentname;
     private String education;
     @Autowired
     private Address1 address;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", education=" + education
				+ ", address=" + address + "]";
	}


	public Student(int studentid, String studentname, String education, Address1 address) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.education = education;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
