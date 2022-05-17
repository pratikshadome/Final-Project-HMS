
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
=======
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 8e53fd8 (Project Commit)
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.HMS.entity.Doctor;
<<<<<<< HEAD
=======
import com.HMS.entity.Patient;
>>>>>>> 8e53fd8 (Project Commit)
import com.HMS.service.DoctorService;


@Controller
public class DoctorController 
{ 
	@Autowired
	DoctorService doctorService;
	
<<<<<<< HEAD
	
	 
=======

	@GetMapping("/doctorbase")
	public String adminn()
	{
		return "doctor/doctorbase";
	}
	
	
	 @GetMapping("/doctorlist")
	 public String doctorlist(Model model)
	 {
		List<Doctor> list1 = this.doctorService.getAllDoctor();
		model.addAttribute("doctorObj", list1);
		 return "admin/doctorlist";
	 }
	
	
		@GetMapping("/adddoctor")
	    public String add1(Model model) {
	        model.addAttribute("doctor", new Doctor());
	        model.addAttribute("title", "Hospital Management System");
	        return "doctor/adddoctor";    
	    }
		
		@GetMapping("/add_doctor")
	    public String add2(Model model) {
	        model.addAttribute("doctor", new Doctor());
	        model.addAttribute("title", "Hospital Management System");
	        return "admin/adddoctor";    
	    }
		
		
		@RequestMapping(value = "/save1", method = RequestMethod.POST)
		public String saveDoctor1(@ModelAttribute("doctor") Doctor doctor) {
			doctorService.saveDoctor1(doctor);
			return "redirect:/doctorlist";
		}
		
	
	
	@GetMapping("/updateDoctor{doctorId}")
	public String editdoctorForm(@PathVariable Long doctorId, Model model) {
		
		System.out.println("update--------------------"+doctorId);
		model.addAttribute("doctor", doctorService.getDoctorBydoctorId(doctorId));
		return "admin/updatedoctor";
	}

	
	@PostMapping("/saveUpdateDoctor{doctorId}")
	 public String updateDoctor(@ModelAttribute Doctor doctor,@PathVariable("doctorId")long doctorId,
			 @RequestParam("doctorProfilePhoto") MultipartFile file)throws IOException
	 
	 {
	 if(file.isEmpty())
	 {
		System.out.println("file is empty");
		doctor.setDoctorImage("doctor.png");
	 }
	 else
	 {
		 System.out.println("1...............................");
		    doctor.setDoctorImage(file.getOriginalFilename());
    		File saveFile = new ClassPathResource("static/images").getFile();
    		Path path= Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
    		Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
    		System.out.println("File is uploaded");
    		//doctor.setDoctorImage(null)
	 }
		    
			 this.doctorService.updateDoctor(doctor, doctorId);
			  return "redirect:admin/doctorlist";
				
		}
	
	
	@GetMapping("/doctorlist/{doctorId}")
	public String deleteDoctor(@PathVariable Long doctorId) {
	System.out.println(doctorId);
		doctorService.deleteDoctorBydoctorId(doctorId);
		return "redirect:admin/doctorlist";
	}

	
>>>>>>> 8e53fd8 (Project Commit)
	 @GetMapping("/doctor_signup")
	 public String signup(Model model)
	 {
		 model.addAttribute("doctor", new Doctor());
<<<<<<< HEAD
		 return "doctor_signup";
=======
		 return "doctor/doctor_signup";
>>>>>>> 8e53fd8 (Project Commit)
	 }
	
	  @PostMapping("/doctorLogin")
	 public String doctorLogin(@ModelAttribute Doctor doctor)
	 {
		 Doctor doctor1= doctorService.doctorLogin(doctor.getDoctorEmail(),doctor.getDoctorContact());
<<<<<<< HEAD
		 if(doctor!=null)
		 {
			 return "doctor_dashboard";
		 }
		 else
		 {
		 return "doctor_login";
		 }
	 }
=======
		 if(doctor1!=null)
		 {
			 return "doctor/doctorbase";
		 }
		 else
		 {
		 return "doctor/doctor_login";
		 }
	 }
	  
	  
		
>>>>>>> 8e53fd8 (Project Commit)
	 
	 @GetMapping("/doctor_login")
	 public String login()
	 {
<<<<<<< HEAD
		 return "doctor_login";
=======
		 return "doctor/doctor_login";
>>>>>>> 8e53fd8 (Project Commit)
	 }
	
	
	@PostMapping("/registerDoctor")
	 public String register(@Valid @ModelAttribute Doctor doctor, BindingResult result, @RequestParam(value="agreement",defaultValue ="false")boolean agreement,Model model,  HttpSession session,@RequestParam("doctorProfilePhoto") MultipartFile file)throws IOException
	 {
		try 
		{
			if(result.hasErrors())
			{
				model.addAttribute("doctor",doctor);
<<<<<<< HEAD
				return "doctor_signup";
=======
				return "doctor/doctor_signup";
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
		    		doctor.setDoctorImage(file.getOriginalFilename());
		    		File saveFile = new ClassPathResource("static/images").getFile();
		    		Path path= Paths.get(saveFile.getAbsolutePath()+File.separator+file.getOriginalFilename());
		    		Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		    		System.out.println("File is uploaded");
		    		
		    	}
				session.setAttribute("message1", new Message("Registration Successfull !" , "alert-success"));
				this.doctorService.addDoctor(doctor);
<<<<<<< HEAD
				return "doctor_login";
=======
				return "doctor/doctor_login";
>>>>>>> 8e53fd8 (Project Commit)
				
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
		
		
<<<<<<< HEAD
		 return "doctor_signup";
=======
		 return "doctor/doctor_signup";
>>>>>>> 8e53fd8 (Project Commit)
		 
	 }
}
