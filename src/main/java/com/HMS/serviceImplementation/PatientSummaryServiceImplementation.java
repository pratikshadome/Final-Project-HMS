package com.HMS.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.entity.PatientAppointment;
import com.HMS.entity.PatientSummary;
import com.HMS.repository.PatientAppointmentRepo;
import com.HMS.repository.PatientSummaryRepo;
import com.HMS.service.PatientAppointmentService;
import com.HMS.service.PatientSummaryService;
@Service
public class PatientSummaryServiceImplementation implements PatientSummaryService
{
	@Autowired
	private PatientSummaryRepo patientsummaryRepo;
	public void savesum(PatientSummary summary)
	{
		this.patientsummaryRepo.save(summary);
	}
	@Override
	public List<PatientSummary> getAllPatientSummary() {
		// TODO Auto-generated method stub
		return patientsummaryRepo.findAll();
	}
	@Override
	public PatientSummary getPatientbyId(int patientId) {
		// TODO Auto-generated method stub
		return this.patientsummaryRepo.findById(patientId).get();
	}
	
	
	 
	 
	@Override
	public List<PatientSummary> listAll() {
		// TODO Auto-generated method stub
		return this.patientsummaryRepo.findAll();
	}
	@Override
	public List<PatientSummary> getPatientSummaryById(int patientId) {
		// TODO Auto-generated method stub
		List<PatientSummary> patientSummary = this.patientsummaryRepo.getPatientSummaryById(patientId);
		System.out.println("Patient  Id     "+patientId);
		System.out.println("Patient Summary      "+patientSummary.size());
		
		
		  for(PatientSummary p : patientSummary ) { System.out.println(p); }
		 
		
		return patientSummary;
	}
	
}