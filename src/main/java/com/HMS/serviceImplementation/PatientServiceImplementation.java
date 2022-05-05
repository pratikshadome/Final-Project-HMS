package com.HMS.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.HMS.entity.Patient;
import com.HMS.repository.PatientRepo;
import com.HMS.service.PatientService;

@Service
public class PatientServiceImplementation implements PatientService
{
  



@Autowired
PatientRepo patientRepo;

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
}