package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> 
{
	public Doctor findByDoctorEmailAndDoctorContact(String email, String contact);

	
}



