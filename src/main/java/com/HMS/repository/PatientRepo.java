package com.HMS.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;





import com.HMS.entity.Patient;


public interface PatientRepo extends JpaRepository<Patient, Long> 
{
	

	public Patient findByPatientEmailAndPatientContact(String email, String contact);

	public Patient findBypatientId(Long patientId);
	
	public Patient findByPatientEmail(String patientEmail);

	

	

	//public void deleteBypatientId(Long patientId);

	
}
