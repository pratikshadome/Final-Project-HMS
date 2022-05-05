package com.HMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor

public class PatientDashboard 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(length = 30,nullable = false)
    @NotBlank(message="please enter patient name")
    private String patientName;
	
	@Column(length = 30,nullable = false)
	@NotBlank(message="please enter patient address")
    private String patientAddress;
	
	@Column(length = 30,nullable = false)
	@NotBlank(message="please enter patient contact")
    private String patientContact;
	
	@Column(length = 30,nullable = false)
	@NotBlank(message="please enter patient email")
    private String patientEmail;
	
	@Column(length = 30,nullable = false)
	@NotBlank(message="please enter patientGender")
    private String patientGender;
	 
	@Column(length = 30,nullable = false)
	@NotBlank(message="please enter patient age")
    private String patientAge;
	 
	@Column(length = 30,nullable = false)
	@NotBlank(message="please enter the doctor name with you have an appointment ")
    private String patientAppointmentwithDr;
    private String patientDisease;
    

    


}
