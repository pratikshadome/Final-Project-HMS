package com.HMS.serviceImplementation;

<<<<<<< HEAD
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
=======
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.HMS.entity.Doctor;
import com.HMS.entity.Patient;
import com.HMS.repository.DoctorRepo;
import com.HMS.service.DoctorService;

@Service
public class DoctorServiceImplementation implements DoctorService {

	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public void addDoctor(Doctor doctor) {
>>>>>>> 8e53fd8 (Project Commit)
		this.doctorRepo.save(doctor);
	}

	@Override
<<<<<<< HEAD
	public Doctor doctorLogin(String email, String contact) {
		// TODO Auto-generated method stub
		 return doctorRepo.findByDoctorEmailAndDoctorContact(email, contact);
	}
	
}
















=======
	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		return doctorRepo.findAll();
	}

	@Override
	public Doctor getDoctorBydoctorId(Long doctorId) {
		Optional<Doctor> optional = doctorRepo.findById(doctorId);
		Doctor doctor = null;
		if (optional.isPresent()) {
			doctor = optional.get();
		} else {
			throw new RuntimeException("Doctor not found");
		}
		return doctor;

	}

	@Override
	public void deleteDoctorBydoctorId(Long doctorId) {

		Doctor doctor = this.doctorRepo.findById(doctorId).get();

		this.doctorRepo.delete(doctor);
	}

	@Override
	public void updateDoctor(Doctor doctor, long doctorId) {
		Doctor doctorObj = doctorRepo.findById(doctorId).get();

		doctorObj.setDoctorName(doctor.getDoctorName());
		doctorObj.setDoctorAddress(doctor.getDoctorAddress());
		doctorObj.setDoctorContact(doctor.getDoctorContact());
		doctorObj.setDoctorEmail(doctor.getDoctorEmail());
		doctorObj.setDoctorImage(doctor.getDoctorImage());

		this.doctorRepo.save(doctorObj);
	}

	@Override
	public Doctor doctorLogin(String email, String contact) {
		return doctorRepo.findByDoctorEmailAndDoctorContact(email, contact);
	}

	@Override
	public void saveDoctor1(Doctor doctor) {
		this.doctorRepo.save(doctor);
	}

}
>>>>>>> 8e53fd8 (Project Commit)
