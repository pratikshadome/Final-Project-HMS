package com.HMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class PatientSummary 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int summary_id;
	@Column
     private String patient_Name;
	@Column
     private String doctor_Name;
	@Column
     private String disease_detected;
	@Column
     private String description;
	@Column
     private String visit_again_on;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Doctor doctor;
    
}
