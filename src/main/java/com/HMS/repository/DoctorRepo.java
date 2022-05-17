package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.entity.Doctor;
<<<<<<< HEAD

public interface DoctorRepo extends JpaRepository<Doctor, Integer> 
{
	public Doctor findByDoctorEmailAndDoctorContact(String email, String contact);

=======
import com.HMS.entity.Patient;

public interface DoctorRepo extends JpaRepository<Doctor, Long> 
{
	public Doctor findByDoctorEmailAndDoctorContact(String email, String contact);

	public Doctor findBydoctorId(Long doctorId);

	

>>>>>>> 8e53fd8 (Project Commit)
	
}



