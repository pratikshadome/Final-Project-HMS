package com.HMS.entity;

<<<<<<< HEAD
    import javax.persistence.Column;
=======
    import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
>>>>>>> 8e53fd8 (Project Commit)


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
<<<<<<< HEAD
	import javax.validation.constraints.Email;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
=======
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
>>>>>>> 8e53fd8 (Project Commit)

	@Entity
	@Setter
	@Getter
	@NoArgsConstructor
<<<<<<< HEAD

=======
    @ToString
    @AllArgsConstructor
>>>>>>> 8e53fd8 (Project Commit)
	public class Patient 
	{
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	     private int patientId;
		 
		 @Column(length = 30,nullable = false)
		 @NotBlank(message="please enter user name")
		 @Size(min=5,max=20, message="minimum character must be 5 and maximum character should be 20")
	     private String patientName;
		 
		 @Column(length = 30,nullable = false)
		 @NotBlank(message="please enter user address")
	     private String patientAddress;
		 
		 @Column(length = 30,nullable = false)
		 @Email(message="please enter correct email address")
	     private String patientEmail;
		 
		 @Column(length = 30,nullable = false)
		 @NotBlank(message="please enter user contact number")
		 @Size(min=10,max=10, message="character size must be 10 digits")
	     private String patientContact;
		 
		 @Column(length = 30,nullable = false)
		 private String patientImage;
		 
=======
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

>>>>>>> 8e53fd8 (Project Commit)
		 
	}

	



	

