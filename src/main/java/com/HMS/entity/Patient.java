package com.HMS.entity;

    import javax.persistence.Column;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.validation.constraints.Email;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	@Entity
	@Setter
	@Getter
	@NoArgsConstructor

	public class Patient 
	{
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
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
		 
		 
	}

	



	

