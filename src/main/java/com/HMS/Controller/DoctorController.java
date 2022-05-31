
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

import com.HMS.entity.Doctor;
import com.HMS.entity.Patient;
import com.HMS.repository.DoctorRepo;
import com.HMS.repository.PatientRepo;
import com.HMS.service.DoctorService;
import com.HMS.service.EmailService;


@Controller
public class DoctorController 
{ 
	Random random=new Random(1000);
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	DoctorRepo doctorRepo;
	
	@GetMapping("/doctorbase")
	public String adminn()
	{
		return "doctor/doctorbase";
	}
	
	  @GetMapping("/doctorlist/{pageNumber}")
	  public String doctor_list(Model model,@PathVariable("pageNumber") int pageNumber, HttpSession session)
	  {
		  Pageable pageable=PageRequest.of(pageNumber,2);
		  Page<Doctor>list1 = this.doctorService.getAllDoctor(pageable);
		  model.addAttribute("doctorObj", list1);
		  model.addAttribute("currentPage", pageNumber);
		  model.addAttribute("totalPages", list1.getTotalPages());
		  		return "admin/doctorlist";
		  
	  }
	  @GetMapping("/doctorlist")
		 public String doctorlist(Model model,HttpSession session)
		 {
//			List<Patient> list1 = this.patientService.getAllPatient();
//			model.addAttribute("patientObj", list1);
//			 return "admin/patient_list";
		    return doctor_list(model, 0, session);
		 }
	
			/*
			 * @GetMapping("/doctorlist") public String doctorlist(Model model) {
			 * List<Doctor> list1 = this.doctorService.getAllDoctor();
			 * model.addAttribute("doctorObj", list1); return "admin/doctorlist"; }
			 */
	
	
		@GetMapping("/adddoctor")
	    public String add1(Model model) {
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
			  return "redirect:/doctorlist";
				
		}
	
	
	@GetMapping("/doctorlist/{doctorId}")
	public String deleteDoctor(@PathVariable Long doctorId) {
	System.out.println(doctorId);
		doctorService.deleteDoctorBydoctorId(doctorId);
		return "redirect:admin/doctorlist";
	}

	
	 @GetMapping("/doctor_signup")
	 public String signup(Model model)
	 {
		 model.addAttribute("doctor", new Doctor());
		 return "doctor/doctor_signup";
	 }
	
	  @PostMapping("/doctorLogin")
	 public String doctorLogin(@ModelAttribute Doctor doctor, HttpSession session)
	 {
		 Doctor doctor1= doctorService.doctorLogin(doctor.getDoctorEmail(),doctor.getDoctorContact());
		 if(doctor1!=null)
		 {
			 session.setAttribute("doctorId", doctor1.getDoctorId());
			 session.setAttribute("doctorName", doctor1.getDoctorName());
			 return "doctor/doctorbase";
		 }
		 else
		 {
		 return "doctor/doctor_login";
		 }
	 }
	  
	  
		
	 
	 @GetMapping("/doctor_login")
	 public String login()
	 {
		 return "doctor/doctor_login";
	 }
	
	
	@PostMapping("/registerDoctor")
	 public String register(@Valid @ModelAttribute Doctor doctor, BindingResult result, @RequestParam(value="agreement",defaultValue ="false")boolean agreement,Model model,  HttpSession session,@RequestParam("doctorProfilePhoto") MultipartFile file)throws IOException
	 {
		try 
		{
			if(result.hasErrors())
			{
				model.addAttribute("doctor",doctor);
				return "doctor/doctor_signup";
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
				return "doctor/doctor_login";
				
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
		
		
		 return "doctor/doctor_signup";
		 
	 }
	@GetMapping("/pass1")
	public String forgotPass()
	{
		return "doctor/forgotpass1";
	}
	
	
	@PostMapping("/send_otp1")
	public String forgot_pass1(@RequestParam("doctorEmail") String doctorEmail,HttpSession session)
	{
		int otp=random.nextInt(9999);
		System.out.println("Email++++++++++++++++++++++++++++++++++++++++++++++++"+doctorEmail);
		System.out.println("OTP++++++++++++++++++++++++++++++++++++++++++++++++++"+otp);
		
		String subject="OTP from HMS";
		String message="<h1> OTP="+otp+"</h1>";
		String to=doctorEmail;
		String from="pratikshashelke2911@gmail.com";
		
		boolean flag=this.emailService.sendEmail(subject,message,to, from);
		if(flag)
		{
			session.setAttribute("newotp", otp);
			session.setAttribute("doctoremail", doctorEmail);
			return "doctor/verify_otp1";
		}
		else 
		{
			return "doctor/forgotpass1";
		}
		
	}
	@PostMapping("/verify-otp1")
	public String verifyotp1(@RequestParam("otp")int otp,HttpSession session)
	{
		int newOtp = (int) session.getAttribute("newotp");
		String doctorEmail = (String) session.getAttribute("doctoremail");
		if(newOtp==otp)
		{
			Doctor doctor22=this.doctorService.checkEmail(doctorEmail);
			if(doctor22==null)
			{
				session.setAttribute("message55",new Message("Doctor does not exist for this email id","alert-success"));
				return "doctor/forgotpass1";
				
			}
			else 
			{
				return "doctor/change_password1";
				
			}
		}
		else 
		{
			session.setAttribute("message66", new Message("you entered wrong otp", "alert-primary"));
			return "doctor/verify_otp1";
		}
	}
	@PostMapping("/change_pass1")
	public String changepass1(@RequestParam("doctorContact")String password,@ModelAttribute Doctor doctor, HttpSession session)
	{
		String email = (String) session.getAttribute("doctoremail");
		System.out.println("++++++++++++++++++++++++++++++++++++++"+email);
		Doctor doctor1 = this.doctorService.checkEmail(email);
		System.out.println("+++++++++++++++++++++++++++++++++++++++"+doctor1);
		doctor1.setDoctorContact(doctor.getDoctorContact());
		
		this.doctorRepo.save(doctor1);
		session.setAttribute("message77",new Message("Password Updated Successfully", "alert-success"));
		return "doctor/doctor_login";
		
	}
}
