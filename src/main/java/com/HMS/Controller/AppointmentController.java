package com.HMS.Controller;

import java.util.List;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.HMS.entity.Doctor;
import com.HMS.entity.Patient;
import com.HMS.entity.PatientAppointment;
import com.HMS.entity.PatientSummary;
import com.HMS.service.DoctorService;
import com.HMS.service.PatientAppointmentService;
import com.HMS.service.PatientService;

@Controller
public class AppointmentController {
	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PatientAppointmentService patientAppointmentService;
	
	@Autowired
	private PatientService patientService;

	
	  @GetMapping("/appointmentlist")
		 public String appointmentlist(Model model)
		 {
			List<PatientAppointment> list1 = this.patientAppointmentService.getAllPatientAppointment();
			model.addAttribute("patientappointmentObj", list1);
			 return "/appointmentlist";
		 }
	  

	  @GetMapping("/appointment_list")
		 public String appointmentlist1(Model model)
		 {
			List<PatientAppointment> list11 = this.patientAppointmentService.getAllPatientAppointment();
			model.addAttribute("patientappointmentObj", list11);
			 return "doctor/appointment_list";
		 }
	  
	  
	  @PostMapping("/saveapp2{patientId}")
		public String saveapp(@ModelAttribute("appointment") PatientAppointment appointment,@PathVariable Long patientId) {

			System.out.println("Patient   Id   "+patientId);
			System.out.println(appointment.getAppointment_id() + "---------Doctor ID-------" + appointment.getDoctor_Name());
			System.out.println("+++++++++++++++++++++=date"+appointment.getDate());
			Long doctorId= Long.parseLong( appointment.getDoctor_Name());
			Patient patient = patientService.getPatientBypatientId(patientId);
			
			Doctor doctor =   doctorService.getDoctorBydoctorId(doctorId);
			
			appointment.setPatient_Name(patient.getPatientName());
			appointment.setFees("500");
			appointment.setDoctor_Name(doctor.getDoctorName());
			/*
			 * appointment.setDate(appointment.getDate());
			 */
			doctor.getPatientAppointment().add(appointment);
			/* patient.getPatientAppointment().add(appointment); */
			appointment.setDoctor(doctor);
			appointment.setPatient(patient);
			
			
			doctorService.addDoctor(doctor);
			 patientService.addPatient(patient); 
			return "redirect:/dashboard";
		
		}
	  
	

	@GetMapping("patient_appointment")
	public String appointment(Model model, HttpSession session) {
		List<Doctor> doctorList = doctorService.getAllDoctor();
		model.addAttribute("appointment", new PatientAppointment());
		session.setAttribute("doctorList", doctorList);
		return "patient/patient_appointment";
	}

	@RequestMapping("/patient_appointment")
	public String about(Model model, HttpSession session) {

		model.addAttribute("title", "Hospital Management System");
		return "patient/patient_appointment";
	}
}
