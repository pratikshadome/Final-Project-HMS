package com.HMS.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doctorId;

	@Column(length = 40, nullable = false)
	@NotBlank(message = "please enter user name")
	@Size(min = 5, max = 20, message = "minimum character must be 5 and maximum character should be 20")
	private String doctorName;

	@Column(length = 40, nullable = false)
	@NotBlank(message = "please enter user address")
	private String doctorAddress;

	@Column(length = 40, nullable = false)
	@Email(message = "please enter correct email address")
	private String doctorEmail;

	@Column(length = 40, nullable = false)
	@NotBlank(message = "please enter doctor contact number")
	@Size(min = 10, max = 10, message = "character size must be 10 digits")
	private String doctorContact;

	@Column(length = 40, nullable = false)
	@NotBlank(message = "please enter doctor education")
	private String doctorEducation;

	@Column(length = 40, nullable = false)
	@NotBlank(message = "please enter doctor experience")
	private String doctorExperience;

	@Column(length = 40, nullable = false)
	@NotBlank(message = "please enter doctor specialization")
	private String doctorSpecialization;

	@Column
	private String doctorImage;
	
	
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List <PatientAppointment> patientAppointment;

	@OneToMany(cascade = CascadeType.ALL)
	private List <PatientSummary> patientSummary;

}
