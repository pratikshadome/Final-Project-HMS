package com.HMS.service;

<<<<<<< HEAD
import com.HMS.entity.Doctor;
=======
import java.util.List;

import com.HMS.entity.Doctor;
import com.HMS.entity.Patient;
>>>>>>> 8e53fd8 (Project Commit)

public interface DoctorService 
{
	 public void addDoctor(Doctor doctor);
     
	  	public Doctor doctorLogin(String email, String contact);
<<<<<<< HEAD
=======

		public List<Doctor> getAllDoctor();

		//public void saveDoctor(Doctor doctor);
		
		public Doctor getDoctorBydoctorId(Long doctorId);
		
		void deleteDoctorBydoctorId(Long doctorId);
		
		public void updateDoctor(Doctor doctor, long doctorId);

		public void saveDoctor1(Doctor doctor);
		
>>>>>>> 8e53fd8 (Project Commit)
}







