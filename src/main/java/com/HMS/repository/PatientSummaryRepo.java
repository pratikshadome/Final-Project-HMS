package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.HMS.entity.PatientAppointment;
import com.HMS.entity.PatientSummary;
import java.util.*;

public interface PatientSummaryRepo extends JpaRepository<PatientSummary,Integer>
{

	
	
	
	 
	  @Query(value = "select * from patient_summary ps WHERE ps.patient_patient_id = :patientId",nativeQuery = true)
		public List<PatientSummary> getPatientSummaryById( @Param("patientId")long patientId);

	
}
