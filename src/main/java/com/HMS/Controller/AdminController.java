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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.HMS.entity.Admin;

import com.HMS.service.AdminService;


@Controller
public class AdminController 
{
	@Autowired
	AdminService adminService;
	
	
	@GetMapping("/admindashboard")
	public String adminn()
	{
		return "admin/admindashboard";
	}

	

	
	
	  @GetMapping("/admin_signup") public String adminsignup(Model model) {
	  model.addAttribute("admin", new Admin()); return "admin/admin_signup"; }
	 
	
	@PostMapping("/checkLogin2")
	public String checkLogin2(@ModelAttribute Admin admin) 
	{
		Admin admin1 = adminService.checkLogin2(admin.getAdminEmail(), admin.getAdminContact());
		System.out.println(admin1);
		if (admin1!= null)
		{
			return "admin/admindashboard";
		} else
		{
			return "admin/admin_login";
		}
	}

	
	  @GetMapping("/admin_login")
	  public String patientlogin()
	  { 
		  return"admin/admin_login"; 
		  }
  

  @PostMapping("/registerAdmin") public String register(@Valid @ModelAttribute
  Admin admin, BindingResult result,
  
  @RequestParam(value = "agreement", defaultValue = "false") boolean agreement,
  Model model, HttpSession session, @RequestParam("adminProfilePhoto")
  MultipartFile file) throws IOException { try { if (result.hasErrors()) {
  model.addAttribute("admin", admin); return "admin/admin_signup"; } if
  (agreement) { if (file.isEmpty()) { System.out.println("File is Empty"); }
  else { admin.setAdminImage(file.getOriginalFilename()); File saveFile = new
  ClassPathResource("static/images").getFile(); Path path =
  Paths.get(saveFile.getAbsolutePath() + File.separator +
  file.getOriginalFilename()); Files.copy(file.getInputStream(), path,
  StandardCopyOption.REPLACE_EXISTING); System.out.println("File is uploaded");
  
  } session.setAttribute("message1", new Message("Registration Successfull !",
  "alert-success")); this.adminService.addAdmin(admin); return
  "admin/admin_login";
  
  } else { session.setAttribute("message1", new
  Message("Admin Is Not Registered !", "alert-danger")); throw new
  Exception("kindly accept the term and conditions!"); } } catch (Exception e)
  { System.out.println(e); }
  
  return "admin/admin_signup";
  
  } }
 
	 