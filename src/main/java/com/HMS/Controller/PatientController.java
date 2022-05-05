
package com.HMS.Controller;

import java.io.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	 
	 @GetMapping("/patient_signup")
	 public String patientsignup(Model model)
	 {
		 model.addAttribute("patient", new Patient());
		 return "patient_signup";
	 }
	
	  @PostMapping("/checkLogin1")
	 public String checkLogin(@ModelAttribute Patient patient)
	 {
		 Patient patient1= patientService.checkLogin1(patient.getPatientEmail(),patient.getPatientContact());
		 if(patient1!=null)
		 {
			 return "patient_dashboard";
		 }
		 else
		 {
		 return "patient_login";
		 }
	 }
	 
	 @GetMapping("/patient_login")
	 public String login()
	 {
		 return "patient_login";
	 }
	
	
	@PostMapping("/registerPatient")
	 public String register(@Valid @ModelAttribute Patient patient, BindingResult result, @RequestParam(value="agreement",defaultValue ="false")boolean agreement,Model model,  HttpSession session, @RequestParam("userProfilePhoto") MultipartFile file)throws IOException
	 {
		try 
		{
			if(result.hasErrors())
			{
				model.addAttribute("patient",patient);
				return "patient_signup";
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
				return "patient_login";
				
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
		
		
		 return "patient_signup";
		 
	 }
}
