package com.greatlearning.application;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		
		Employee e2 = new Employee("Sanju","Samson");

		String genEId = "";
		String genPwd = "";
		CredentialService cs = new CredentialService();
		
		System.out.println("Please Enter the Department from the Following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: 
		genEId = cs.generateEmailAddress(e2,"technical");
		genPwd = cs.generatePassword();
		cs.showCredentials(e2.getFirstName(),genEId,genPwd);
		break;
		        
		case 2: 
		genEId = cs.generateEmailAddress(e2,"admin");
		genPwd = cs.generatePassword();
		cs.showCredentials(e2.getFirstName(),genEId,genPwd);
		break;
			
		case 3: 
		genEId = cs.generateEmailAddress(e2,"humanresource");
		genPwd = cs.generatePassword();
		cs.showCredentials(e2.getFirstName(),genEId,genPwd);
		break;
			
		case 4: 
		genEId = cs.generateEmailAddress(e2,"legal");
		genPwd = cs.generatePassword();
		cs.showCredentials(e2.getFirstName(),genEId,genPwd);
		break;
			
		default : System.out.println("Please Enter a Valid Choice!");
		}
		
	}

}
