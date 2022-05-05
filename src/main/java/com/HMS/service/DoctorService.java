package com.HMS.service;

import com.HMS.entity.Doctor;

public interface DoctorService 
{
	 public void addDoctor(Doctor doctor);
     
	  	public Doctor doctorLogin(String email, String contact);
}







