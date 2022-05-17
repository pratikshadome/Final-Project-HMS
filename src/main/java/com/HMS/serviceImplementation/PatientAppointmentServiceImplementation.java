package com.HMS.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.entity.Patient;
import com.HMS.entity.PatientAppointment;
import com.HMS.repository.PatientAppointmentRepo;
import com.HMS.repository.PatientRepo;
import com.HMS.service.PatientAppointmentService;
import com.HMS.service.PatientService;
@Service
public class PatientAppointmentServiceImplementation implements PatientAppointmentService
{
	@Autowired
	private PatientAppointmentRepo patientappointmentRepo;
	public void saveapp(PatientAppointment appointment)
	{
		this.patientappointmentRepo.save(appointment);
	}
}
