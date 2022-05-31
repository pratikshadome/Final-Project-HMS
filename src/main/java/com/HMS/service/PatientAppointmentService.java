package com.HMS.service;

import java.util.List;


import com.HMS.entity.PatientAppointment;

public interface PatientAppointmentService 
{

	public void saveapp(PatientAppointment appointment);

	public List<PatientAppointment> getAllPatientAppointment();
		
		
	

	

}
