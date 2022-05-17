package com.HMS.service;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 8e53fd8 (Project Commit)
import com.HMS.entity.Patient;



public interface PatientService 
{
<<<<<<< HEAD
      public void addPatient(Patient patient);
      
  	
	public Patient checkLogin1(String Email, String Contact);
}
=======
    public void addPatient(Patient patient);
    public Patient checkLogin1(String Email, String Contact);
    
	public List<Patient> getAllPatient();
	
	public Patient savePatient(Patient patient);
	
	public Patient getPatientBypatientId(Long patientId);
	
	void deletePatientBypatientId(Long patientId);
	
	public void updatePatient(Patient patient,long patientId);
	
	
	
	
}








	
	

>>>>>>> 8e53fd8 (Project Commit)
