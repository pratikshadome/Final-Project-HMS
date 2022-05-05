package com.HMS.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.entity.Doctor;
import com.HMS.repository.DoctorRepo;
import com.HMS.service.DoctorService;
@Service
public class DoctorServiceImplementation implements DoctorService
{
	@Autowired
	DoctorRepo doctorRepo;

	@Override
	public void addDoctor(Doctor doctor)
	{
		this.doctorRepo.save(doctor);
	}

	@Override
	public Doctor doctorLogin(String email, String contact) {
		// TODO Auto-generated method stub
		 return doctorRepo.findByDoctorEmailAndDoctorContact(email, contact);
	}
	
}
















