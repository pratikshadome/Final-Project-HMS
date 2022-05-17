package com.HMS.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.entity.Admin;
import com.HMS.repository.AdminRepo;
import com.HMS.repository.PatientRepo;
import com.HMS.service.AdminService;


@Service
public class AdminServiceImplementation implements AdminService
{


	@Autowired
	AdminRepo adminRepo;

	@Override
	public void addAdmin(Admin admin)
	{
		this.adminRepo.save(admin);
	}

	@Override
	public Admin checkLogin2(String Email, String Contact) 
	{
		return adminRepo.findByAdminEmailAndAdminContact(Email, Contact);
	
	}

}
