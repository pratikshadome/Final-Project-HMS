package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.entity.Patient;
import com.HMS.entity.PatientAppointment;

public interface PatientAppointmentRepo extends JpaRepository<PatientAppointment,Integer>
{

}
