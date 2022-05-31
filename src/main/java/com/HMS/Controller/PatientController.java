
package com.HMS.Controller;


import java.io.File;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.HMS.entity.Patient;
import com.HMS.repository.PatientRepo;
import com.HMS.service.EmailService;
import com.HMS.service.PatientService;

@Controller
public class PatientController 
{ 
	Random random=new Random(1000);
	@Autowired
	PatientService patientService;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	PatientRepo patientRepo;
	
	  @RequestMapping("/home")
	  public String home11(Model model)
	  {
		  model.addAttribute("title","Hospital Management System");
		  return "dashboard";
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
	
	
	  
	  @GetMapping("/dashboard")
		public String dashboard(Model model) {
			model.addAttribute("title","dashboard-hospital mgmt system");
			
			return "dashboard";
			
			
		}
		
		@GetMapping("/home")
		public String home(Model model) {
			model.addAttribute("title","home-hospital mgmt system");
			
			return "home";
			
			
		}
	  
	  @GetMapping("/patientbase")
		public String patient()
		{
			return "patient/patientbase";
		}
	  
	  
	  @GetMapping("/patient_list/{pageNumber}")
	  public String patient_list(Model model,@PathVariable("pageNumber") int pageNumber, HttpSession session)
	  {
		  Pageable pageable=PageRequest.of(pageNumber,5);
		  Page<Patient>list = this.patientService.getAllPatient(pageable);
		  model.addAttribute("patientObj", list);
		  model.addAttribute("currentPage", pageNumber);
		  model.addAttribute("totalPages", list.getTotalPages());
		  		return "admin/patient_list";
		  
	  }
	  @GetMapping("/patient_list")
		 public String patientlist(Model model,HttpSession session)
		 {
//			List<Patient> list1 = this.patientService.getAllPatient();
//			model.addAttribute("patientObj", list1);
//			 return "admin/patient_list";
		    return patient_list(model, 0, session);
		 }
		
	  @GetMapping("/patientlist1")
		 public String patientlist1(Model model)
		 {
			List<Patient> list1 = this.patientService.getAllPatient();
			model.addAttribute("patientObj", list1);
			 return "doctor/patientlist1";
		 }
	  
	  @GetMapping("/patientlist")
		 public String patientlist2(Model model)
		 {
			List<Patient> list1 = this.patientService.getAllPatient();
			model.addAttribute("patientObj", list1);
			 return "patient/patientlist";
		 }
		 @RequestMapping("/addpatient")
			public String addpatient(Model model) 
			{
				model.addAttribute("title", "Hospital Management System");
				return "addpatient";
			}

			@GetMapping("/addpatient")
		    public String add1(Model model) {
		        model.addAttribute("patient", new Patient());
		        return "admin/addpatient";    
		    }
		
		@RequestMapping(value = "/save", method = RequestMethod.POST)
			public String savePatient(@ModelAttribute("patient") Patient patient) {
				patientService.savePatient(patient);
				//return "redirect:/patient_list";
				  return "redirect:/patient_list";  
			}
			
		@GetMapping("/updatePatient{patientId}")
			public String editdoctorForm(@PathVariable Long patientId, Model model) {
				
				System.out.println("update--------------------"+patientId);
				model.addAttribute("patient", patientService.getPatientBypatientId(patientId));
				return "admin/updatepatient";
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
				 return "redirect:/patient_list";
					
			}
		
		@GetMapping("/patientlist/{patientId}")
		public String deletePatient(@PathVariable("patientId") Long patientId) 
		{
		    System.out.println(patientId);
			patientService.deletePatientBypatientId(patientId);
			return "redirect:/patient_list";
		}
		
		
	 
	 @GetMapping("/patient_signup")
	 public String patientsignup(Model model)
	 {
		 model.addAttribute("patient", new Patient());
		 return "patient/patient_signup";
	 }
	
	  @PostMapping("/checkLogin1")
	 public String checkLogin(@ModelAttribute Patient patient, HttpSession session)
	 {
		 Patient patient1= patientService.checkLogin1(patient.getPatientEmail(),patient.getPatientContact());
		 if(patient1!=null)
		 {
			 session.setAttribute("patient", patient1);
			 session.setAttribute("patientId", patient1.getPatientId());
			 session.setAttribute("patientName", patient1.getPatientName());
			 return "patient/patientbase";
		 }
		 else
		 {
		 return "patient/patient_login";
		 }
	 }
	 
	 @GetMapping("/patient_login")
	 public String login()
	 {
		 return "patient/patient_login";
	 }
	
	
	@PostMapping("/registerPatient")
	 public String register(@Valid @ModelAttribute Patient patient, BindingResult result,
			 @RequestParam(value="agreement",defaultValue ="false")boolean agreement,Model model,  HttpSession session, 
			 @RequestParam("patientProfilePhoto") MultipartFile file)throws IOException
	 {
		try 
		{
			if(result.hasErrors())
			{
				model.addAttribute("patient",patient);
				return "patient/patient_signup";
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
				return "patient/patient_login";
				
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
		
		
		 return "patient/patient_signup";
		 
	 }
	@GetMapping("/pass")
	public String forgotPass()
	{
		return "forgotpass";
	}
	
	
	@PostMapping("/send_otp")
	public String forgot_pass(@RequestParam("patientEmail") String patientEmail,HttpSession session)
	{
		int otp=random.nextInt(9999);
		System.out.println("Email++++++++++++++++++++++++++++++++++++++++++++++++"+patientEmail);
		System.out.println("OTP++++++++++++++++++++++++++++++++++++++++++++++++++"+otp);
		
		String subject="OTP from HMS";
		String message="<h1> OTP="+otp+"</h1>";
		String to=patientEmail;
		String from="pratikshashelke2911@gmail.com";
		
		boolean flag=this.emailService.sendEmail(subject,message,to, from);
		if(flag)
		{
			session.setAttribute("newotp", otp);
			session.setAttribute("patientemail", patientEmail);
			return "verify_otp";
		}
		else 
		{
			return "forgotpass";
		}
		
	}
	@PostMapping("/verify-otp")
	public String verifyotp(@RequestParam("otp")int otp,HttpSession session)
	{
		int newOtp = (int) session.getAttribute("newotp");
		String patientEmail = (String) session.getAttribute("patientemail");
		if(newOtp==otp)
		{
			Patient patient22=this.patientService.checkEmail(patientEmail);
			if(patient22==null)
			{
				session.setAttribute("message5",new Message("Patient does not exist for this email id","alert-success"));
				return "forgotpass";
				
			}
			else 
			{
				return "change_password";
				
			}
		}
		else 
		{
			session.setAttribute("message6", new Message("you entered wrong otp", "alert-primary"));
			return "verify_otp";
		}
	}
	@PostMapping("/change_pass")
	public String changepass(@RequestParam("patientContact")String password,@ModelAttribute Patient patient, HttpSession session)
	{
		String email = (String) session.getAttribute("patientemail");
		System.out.println("++++++++++++++++++++++++++++++++++++++"+email);
		Patient patient1 = this.patientService.checkEmail(email);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"+patient1);
		patient1.setPatientContact(patient.getPatientContact());
		
		this.patientRepo.save(patient1);
		session.setAttribute("message7",new Message("Password Updated Successfully", "alert-success"));
		return "patient/patient_login";
		
	}
}




