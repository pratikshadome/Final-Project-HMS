
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.HMS.entity.Doctor;
import com.HMS.service.DoctorService;


@Controller
public class DoctorController 
{ 
	@Autowired
	DoctorService doctorService;
	
	
	 
	 @GetMapping("/doctor_signup")
	 public String signup(Model model)
	 {
		 model.addAttribute("doctor", new Doctor());
		 return "doctor_signup";
	 }
	
	  @PostMapping("/doctorLogin")
	 public String doctorLogin(@ModelAttribute Doctor doctor)
	 {
		 Doctor doctor1= doctorService.doctorLogin(doctor.getDoctorEmail(),doctor.getDoctorContact());
		 if(doctor!=null)
		 {
			 return "doctor_dashboard";
		 }
		 else
		 {
		 return "doctor_login";
		 }
	 }
	 
	 @GetMapping("/doctor_login")
	 public String login()
	 {
		 return "doctor_login";
	 }
	
	
	@PostMapping("/registerDoctor")
	 public String register(@Valid @ModelAttribute Doctor doctor, BindingResult result, @RequestParam(value="agreement",defaultValue ="false")boolean agreement,Model model,  HttpSession session,@RequestParam("doctorProfilePhoto") MultipartFile file)throws IOException
	 {
		try 
		{
			if(result.hasErrors())
			{
				model.addAttribute("doctor",doctor);
				return "doctor_signup";
			}
		    if(agreement)
			 {
		    	if(file.isEmpty())
		    	{
		    		System.out.println("File is Empty");
		    	}
		    	else
		    	{
		    		doctor.setDoctorImage(file.getOriginalFilename());
		    		File saveFile = new ClassPathResource("static/images").getFile();
		    		Path path= Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
		    		Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		    		System.out.println("File is uploaded");
		    		
		    	}
				session.setAttribute("message1", new Message("Registration Successfull !" , "alert-success"));
				this.doctorService.addDoctor(doctor);
				return "doctor_login";
				
			 }
			 else
			 {
				 session.setAttribute("message1", new Message("Doctor Is Not Registered !","alert-danger"));
				 throw new Exception("kindly accept the term and conditions!");
			 }
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		
		 return "doctor_signup";
		 
	 }
}
