package com.HMS.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.HMS.entity.Doctor;
import com.HMS.entity.Patient;

public interface DoctorService 
{
	 public void addDoctor(Doctor doctor);
     
	  	public Doctor doctorLogin(String email, String contact);

		public List<Doctor> getAllDoctor();

		//public void saveDoctor(Doctor doctor);
		
		public Doctor getDoctorBydoctorId(Long doctorId);
		
		void deleteDoctorBydoctorId(Long doctorId);
		
		public void updateDoctor(Doctor doctor, long doctorId);

		public void saveDoctor1(Doctor doctor);

		public Doctor checkEmail(String doctorEmail);
		

		public void updatePassword(Doctor doctor, int doctorId);
		public  Page <Doctor> getAllDoctor(Pageable pageable); 
		
}







