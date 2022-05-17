package com.HMS.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.HMS.entity.Doctor;
import com.HMS.entity.Patient;
import com.HMS.entity.PatientAppointment;
import com.HMS.service.DoctorService;
import com.HMS.service.PatientAppointmentService;
import com.HMS.service.PatientService;

@Controller
public class AppointmentController
{
	 @Autowired
	 private DoctorService doctorService;
	@Autowired
	 private PatientAppointmentService patientAppointmentService;
	 
	 @GetMapping("patient_appointment") 
	  public String appointment(Model model, HttpSession session) 
	  {
		 List<Doctor> doctorList = doctorService.getAllDoctor();
		 model.addAttribute("appointment",new PatientAppointment());
		 session.setAttribute("doctorList", doctorList);
	     return "patient/patient_appointment"; 
	  }
	 
	 @RequestMapping(value = "/saveapp", method = RequestMethod.POST)
		public String saveapp(@ModelAttribute("appointment") PatientAppointment appointment) {
		 
		    System.out.println(appointment.getAppointment_id()+"----------------"+appointment.getDate());
		    
			patientAppointmentService.saveapp(appointment);
			return "redirect:/home";
		}
	 
				
	
	  @RequestMapping("/patient_appointment")
	  public String about(Model model, HttpSession session)
	  {
		  
		  model.addAttribute("title","Hospital Management System");
		  return "patient/patient_appointment";
	  }
}
