package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public String generateEmailAddress(Employee e2, String dept) {
	 
		return e2.getFirstName().toLowerCase()+ e2.getLastName().toLowerCase()+"@"+dept+".gl.com";
	}
	
	public String generatePassword() {
		
		String Ucase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lcase = "abcdefghijklmnopqrstuvwxyz";
		String Num   = "0123456789";
		String Schar = "!@#$%^&*?/:;>+-<~";
		String Value = Ucase+Lcase+Num+Schar;
		char p[] = new char [8];
		
		Random random = new Random();
		int i;
		
		for (i=0;i<8;i++) {
			
			p[i] = Value.charAt(random.nextInt(Value.length()));
		}
		
		return new String (p);
	}
	
	public void showCredentials(String fname, String genEId, String genPwd) {
		
		System.out.println("Dear "+fname+" your generated credentials are as follows");
		System.out.println("Email --->  " + genEId);
		System.out.println("Password --->  " + genPwd);
		
	}
	
}
