package com.HMS.serviceImplementation;

import java.util.List;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.HMS.entity.Patient;
import com.HMS.repository.PatientRepo;
import com.HMS.service.PatientService;


@Service
public class PatientServiceImplementation implements PatientService
{
  



@Autowired
private PatientRepo patientRepo;

@Override
public void addPatient(Patient patient)
{
	this.patientRepo.save(patient);
}

@Override
public Patient checkLogin1(String email, String contact) {
	// TODO Auto-generated method stub
	 return patientRepo.findByPatientEmailAndPatientContact(email, contact);
}

@Override
public List<Patient> getAllPatient() {
	// TODO Auto-generated method stub
	return patientRepo.findAll();
}
	
	@Override
	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}

	
	  @Override 
	  public Patient getPatientBypatientId(Long patientId)
	  { 
		   Optional<Patient> optional=patientRepo.findById(patientId);
		    Patient patient=null;
		    if(optional.isPresent())
		    {
		    	patient=optional.get();
		    }
		    else
		    {
		    	throw new RuntimeException("Patient not found");
		    }
			return patient;
		 
	  }
	 

	@Override
	public void deletePatientBypatientId(Long patientId) 
	{
		//patientRepo.deleteBypatientId(patientId);	
		
		Patient  patient = this.patientRepo.findById(patientId).get();
		
		this.patientRepo.delete(patient);
	}


	

	@Override
	public void updatePatient(Patient patient, long patientId) 
	{
		Patient patientObj = patientRepo.findById(patientId).get();
		
		patientObj.setPatientName(patient.getPatientName());
		patientObj.setPatientAddress(patient.getPatientAddress());
		patientObj.setPatientContact(patient.getPatientContact());
		patientObj.setPatientEmail(patient.getPatientEmail());
		patientObj.setPatientImage(patient.getPatientImage());
		
		this.patientRepo.save(patientObj);
	}

	@Override
	public Patient checkEmail(String patientEmail) {
		// TODO Auto-generated method stub
		return patientRepo.findByPatientEmail(patientEmail);
	}

	@Override
	public void updatePassword(Patient patient, int patientId) {
		
		
	}

	@Override
	public Page<Patient> getAllPatient(Pageable pageable) {
		
		return patientRepo.findAll(pageable);
	}

	
	}








	
	

	

	