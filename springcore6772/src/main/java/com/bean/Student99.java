package com.bean;

public class Student99
{
       private int studentid;
       private String studentname;
       private int studentage;
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
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage + "]";
	}
	public Student99(int studentid, String studentname, int studentage) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentage = studentage;
	}
	public Student99() {
		super();
		// TODO Auto-generated constructor stub
	}
       
}
