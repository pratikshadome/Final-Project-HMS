package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.entity.Doctor;
import com.HMS.entity.Patient;

public interface DoctorRepo extends JpaRepository<Doctor, Long> 
{
	public Doctor findByDoctorEmailAndDoctorContact(String email, String contact);

	public Doctor findBydoctorId(Long doctorId);

	public Doctor findByDoctorEmail(String doctorEmail);

	
}



