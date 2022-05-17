package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;





import com.HMS.entity.Patient;


<<<<<<< HEAD
public interface PatientRepo extends JpaRepository<Patient, Integer> 
=======
public interface PatientRepo extends JpaRepository<Patient, Long> 
>>>>>>> 8e53fd8 (Project Commit)
{
	

	public Patient findByPatientEmailAndPatientContact(String email, String contact);

<<<<<<< HEAD
=======
	public Patient findBypatientId(Long patientId);

	//public void deleteBypatientId(Long patientId);

>>>>>>> 8e53fd8 (Project Commit)
	
}
