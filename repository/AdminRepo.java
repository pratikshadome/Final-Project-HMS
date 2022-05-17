package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.entity.Admin;
import com.HMS.entity.Patient;


public interface AdminRepo extends JpaRepository<Admin, Integer> 
{

	public Admin findByAdminEmailAndAdminContact(String email, String contact);

}
