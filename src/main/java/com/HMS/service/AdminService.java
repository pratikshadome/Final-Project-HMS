package com.HMS.service;

import com.HMS.entity.Admin;

public interface AdminService 
{
	 public void addAdmin(Admin admin);
	    public Admin checkLogin2(String Email, String Contact);
}
