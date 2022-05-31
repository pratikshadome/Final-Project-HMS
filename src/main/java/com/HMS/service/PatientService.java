package com.HMS.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.HMS.entity.Patient;



public interface PatientService 
{
    public void addPatient(Patient patient);
    public Patient checkLogin1(String Email, String Contact);
    
	public List<Patient> getAllPatient();
	
	public Patient savePatient(Patient patient);
	
	public Patient getPatientBypatientId(Long patientId);
	
	void deletePatientBypatientId(Long patientId);
	
	public void updatePatient(Patient patient,long patientId);
	
	public Patient checkEmail(String patientEmail);
	
	public void updatePassword(Patient patient, int patientId);
	public  Page <Patient> getAllPatient(Pageable pageable); 
	
	
}








	
	

