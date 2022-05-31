package com.HMS.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HMS.entity.Doctor;
import com.HMS.entity.Patient;
import com.HMS.entity.PatientAppointment;
import com.HMS.entity.PatientSummary;
import com.HMS.service.DoctorService;
import com.HMS.service.PatientAppointmentService;
import com.HMS.service.PatientService;
import com.HMS.service.PatientSummaryService;
import com.HMS.service.PdfExporter;
import com.lowagie.text.DocumentException;

@Controller
public class SummaryController {
	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PatientSummaryService patientSummaryService;

	@Autowired
	private PatientService patientService;

	@GetMapping("patient_summary")
	public String summary(Model model, HttpSession session) {
		List<Patient> patientList = patientService.getAllPatient();
		model.addAttribute("summary", new PatientSummary());
		session.setAttribute("patientList", patientList);
		return "doctor/patient_summary";

	}

	@RequestMapping("/patient_summary")
	public String about(Model model, HttpSession session) {

		model.addAttribute("title", "Hospital Management System");
		return "doctor/patient_summary";
	}

	@GetMapping("/summarylist")
	public String summarylist(Model model) {
		List<PatientSummary> list2 = this.patientSummaryService.getAllPatientSummary();
		model.addAttribute("patientsummaryObj", list2);
		return "doctor/summarylist";
	}

	@GetMapping("/summary_list")
	public String summarylist1(Model model) {
		List<PatientSummary> list2 = this.patientSummaryService.getAllPatientSummary();
		model.addAttribute("patientsummaryObj1", list2);
		return "admin/summary_list";
	}

	@PostMapping("/savesum2{doctorId}")
	public String savesum(@ModelAttribute("summary") PatientSummary summary, @PathVariable Long doctorId) {

		System.out.println("Doctor   Id   " + doctorId);
		System.out.println(summary.getSummary_id() + "---------Doctor ID-------" + summary.getPatient_Name());

		Long patientId = Long.parseLong(summary.getPatient_Name());
		Patient patient = patientService.getPatientBypatientId(patientId);

		Doctor doctor = doctorService.getDoctorBydoctorId(doctorId);

		summary.setPatient_Name(patient.getPatientName());
		/* summary.setFees("500"); */
		summary.setDoctor_Name(doctor.getDoctorName());
		/*
		 * appointment.setDate(appointment.getDate());
		 */
		doctor.getPatientSummary().add(summary);
		/* patient.getPatientAppointment().add(appointment); */
		summary.setDoctor(doctor);
		summary.setPatient(patient);

		doctorService.addDoctor(doctor);
		patientService.addPatient(patient);
		return "redirect:/patient_summary";
	}

	@GetMapping("/patientPrescription/{patientId}")
	public String patientPrescription(Model model, HttpSession session, @PathVariable("patientId") int patientId) {

		
		List<PatientSummary> patientSummary = this.patientSummaryService.getPatientSummaryById(patientId);
		
		
		
		
		  
		 
//		  List<PatientSummary> patientsummary =this.patientSummaryService.findByPatientId(patientId);
//		  
	 
			model.addAttribute("patientSummary", patientSummary);

		return "/patient/patientPrescription";
	  
	}

	@GetMapping("/download_prescription pdf")
	public void downloadpdf(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss");
		String currentDateTime = format.format(new Date());
		response.setHeader("Content-Disposition", "attachment; filename=Report From SMS_ " + currentDateTime + " .pdf");
		List<PatientSummary> listsummary = patientSummaryService.listAll();
		PdfExporter exporter = new PdfExporter(listsummary);
		exporter.export(response);
		// marksService.downloadPDF(response.getWriter(), createData());
	}

}
