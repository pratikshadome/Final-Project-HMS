package com.HMS.entity;

    import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;


	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

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
	public class Patient 
	{
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
	     private long patientId;
		 
		 @Column
	     private String patientName;
		 
		 @Column
	     private String patientAddress;
		 
		 @Column
	     private String patientEmail;
		 
		 @Column
	     private String patientContact;
		 
		 @Column
		 private String patientImage;
		 
		 @OneToMany(cascade = CascadeType.ALL)
		 private List <PatientAppointment> patientAppointment;

		 @OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
		 private List <PatientSummary> patientSummary;

		 
	}

	



	

