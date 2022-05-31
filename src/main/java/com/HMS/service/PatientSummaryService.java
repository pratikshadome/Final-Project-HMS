package com.HMS.service;

import java.util.List;

import com.HMS.entity.PatientAppointment;
import com.HMS.entity.PatientSummary;

public interface PatientSummaryService 
{
	public void savesum(PatientSummary summary);

	public List<PatientSummary> getAllPatientSummary();
	
	public PatientSummary getPatientbyId(int patientId);

	public List<PatientSummary> listAll();
	
	//public List<PatientSummary> findByPatientId(long patientId);
	
	List<PatientSummary>  getPatientSummaryById(int patientId);
	
}
