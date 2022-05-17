
package com.HMS.Controller;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> 8e53fd8 (Project Commit)

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


>>>>>>> 8e53fd8 (Project Commit)
import com.HMS.entity.Patient;
import com.HMS.service.PatientService;

@Controller
public class PatientController 
{ 
	@Autowired
	PatientService patientService;
	
	 @RequestMapping("/home")
	  public String home1(Model model)
	  {
		  model.addAttribute("title","Hospital Management System");
		  return "home";
	  }
	
	  @RequestMapping("/logout")
	  public String logout1(Model model)
	  {
		  model.addAttribute("title","Hospital Management System");
		  return "home";
	  }
	  
	  @RequestMapping("/about")
	  public String about(Model model)
	  {
		  model.addAttribute("title","Hospital Management System");
		  return "about";
	  }
	
	  @GetMapping("/home") 
	  public String home() 
	  {
	  return "home"; 
	  }
<<<<<<< HEAD
=======
	  
	  
	  @GetMapping("/patientbase")
		public String patient()
		{
			return "patient/patientbase";
		}
	  
	  
	  @GetMapping("/patientlist")
		 public String patientlist(Model model)
		 {
			List<Patient> list1 = this.patientService.getAllPatient();
			model.addAttribute("patientObj", list1);
			 return "patient/patientlist";
		 }
	  
	  @GetMapping("/patient_list")
		 public String patientlist1(Model model)
		 {
			List<Patient> list1 = this.patientService.getAllPatient();
			model.addAttribute("patientObj", list1);
			 return "admin/patient_list";
		 }
	  @GetMapping("/patientlist1")
		 public String patientlist2(Model model)
		 {
			List<Patient> list1 = this.patientService.getAllPatient();
			model.addAttribute("patientObj", list1);
			 return "doctor/patientlist1";
		 }
		
//		 @RequestMapping("/addpatient")
//			public String addpatient(Model model) 
//			{
//				model.addAttribute("title", "Hospital Management System");
//				return "addpatient";
//			}

			@GetMapping("/addpatient")
		    public String add1(Model model) {
		        model.addAttribute("patient", new Patient());
		        return "patient/addpatient";    
		    }
		
		    @PostMapping("/save")
			public String savePatient(@ModelAttribute("patient") Patient patient) {
				patientService.savePatient(patient);
				return "redirect:/patientlist";
			}
			
		@GetMapping("/updatePatient{patientId}")
			public String editdoctorForm(@PathVariable Long patientId, Model model) {
				
				System.out.println("update--------------------"+patientId);
				model.addAttribute("patient", patientService.getPatientBypatientId(patientId));
				return "patient/updatepatient";
			}
		
		@PostMapping("/saveUpdatePatient{patientId}")
		 public String updatePatient(@ModelAttribute Patient patient,@PathVariable("patientId")long patientId,
				 @RequestParam("patientProfilePhoto") MultipartFile file)throws IOException
		 {
		 if(file.isEmpty())
		 {
			System.out.println("file is empty");
		 }
		 else
		 {
			 System.out.println("...............................");
			    patient.setPatientImage(file.getOriginalFilename());
	    		File saveFile = new ClassPathResource("static/images").getFile();
	    		Path path= Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
	    		Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
	    		System.out.println("File is uploaded");
		 }
			    
				 this.patientService.updatePatient(patient, patientId);
				  return "redirect:/doctor/patientlist1";
					
			}
		
		@GetMapping("/patientlist/{patientId}")
		public String deletePatient(@PathVariable Long patientId) {
		System.out.println(patientId);
			patientService.deletePatientBypatientId(patientId);
			return "redirect:patient/patientlist";
		}
		
		
>>>>>>> 8e53fd8 (Project Commit)
	 
	 @GetMapping("/patient_signup")
	 public String patientsignup(Model model)
	 {
		 model.addAttribute("patient", new Patient());
<<<<<<< HEAD
		 return "patient_signup";
	 }
	
	  @PostMapping("/checkLogin1")
	 public String checkLogin(@ModelAttribute Patient patient)
=======
		 return "patient/patient_signup";
	 }
	
	  @PostMapping("/checkLogin1")
	 public String checkLogin(@ModelAttribute Patient patient, HttpSession session)
>>>>>>> 8e53fd8 (Project Commit)
	 {
		 Patient patient1= patientService.checkLogin1(patient.getPatientEmail(),patient.getPatientContact());
		 if(patient1!=null)
		 {
<<<<<<< HEAD
			 return "patient_dashboard";
		 }
		 else
		 {
		 return "patient_login";
=======
			 session.setAttribute("patientId", patient1.getPatientId());
			 session.setAttribute("patientName", patient1.getPatientName());
			 return "patient/patientbase";
		 }
		 else
		 {
		 return "patient/patient_login";
>>>>>>> 8e53fd8 (Project Commit)
		 }
	 }
	 
	 @GetMapping("/patient_login")
	 public String login()
	 {
<<<<<<< HEAD
		 return "patient_login";
=======
		 return "patient/patient_login";
>>>>>>> 8e53fd8 (Project Commit)
	 }
	
	
	@PostMapping("/registerPatient")
<<<<<<< HEAD
	 public String register(@Valid @ModelAttribute Patient patient, BindingResult result, @RequestParam(value="agreement",defaultValue ="false")boolean agreement,Model model,  HttpSession session, @RequestParam("userProfilePhoto") MultipartFile file)throws IOException
=======
	 public String register(@Valid @ModelAttribute Patient patient, BindingResult result,
			 @RequestParam(value="agreement",defaultValue ="false")boolean agreement,Model model,  HttpSession session, 
			 @RequestParam("patientProfilePhoto") MultipartFile file)throws IOException
>>>>>>> 8e53fd8 (Project Commit)
	 {
		try 
		{
			if(result.hasErrors())
			{
				model.addAttribute("patient",patient);
<<<<<<< HEAD
				return "patient_signup";
=======
				return "patient/patient_signup";
>>>>>>> 8e53fd8 (Project Commit)
			}
		    if(agreement)
			 {
		    	if(file.isEmpty())
		    	{
		    		System.out.println("File is Empty");
		    	}
		    	else
		    	{
		    		patient.setPatientImage(file.getOriginalFilename());
		    		File saveFile = new ClassPathResource("static/images").getFile();
		    		Path path= Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
		    		Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		    		System.out.println("File is uploaded");
		    		
		    	}
				session.setAttribute("message1", new Message("Registration Successfull !" , "alert-success"));
				this.patientService.addPatient(patient);
<<<<<<< HEAD
				return "patient_login";
=======
				return "patient/patient_login";
>>>>>>> 8e53fd8 (Project Commit)
				
			 }
			 else
			 {
				 session.setAttribute("message1", new Message("Patient Is Not Registered !","alert-danger"));
				 throw new Exception("kindly accept the term and conditions!");
			 }
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		
<<<<<<< HEAD
		 return "patient_signup";
		 
	 }
}
=======
		 return "patient/patient_signup";
		 
	 }
}




>>>>>>> 8e53fd8 (Project Commit)
