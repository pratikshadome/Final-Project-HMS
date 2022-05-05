package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;





import com.HMS.entity.Patient;


public interface PatientRepo extends JpaRepository<Patient, Integer> 
{
	

	public Patient findByPatientEmailAndPatientContact(String email, String contact);

	
}
