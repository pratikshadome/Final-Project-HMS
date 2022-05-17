package com.HMS.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

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
public class PatientAppointment 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long appointment_id;
	@Column
	//@NotBlank(message = "please enter doctor name")
    private String patient_Name;
	@Column
	//@NotBlank(message = "please enter doctor name")
    private String doctor_Name;
	@Column
	//@NotBlank(message = "please enter dotor specialization")
    private String doctor_Specialization;

	@Column
	//@NotBlank(message = "please enter Date")
    private Date date;
	
	@Column
	//@NotBlank(message = "please enter time Slot")
    private String time_Slot;
	
	@Column
	private String fees;
    
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Doctor doctor;
    
    
}
