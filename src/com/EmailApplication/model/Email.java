package com.EmailApplication.model;

import java.util.Scanner;

public class Email {
	//Encapsulating properties
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternativeEmail;
	private int mailBoxCapacity;
	
	//constructors
	public Email(){
		
	}
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Calling method to set the department
		this.department = this.setDepartment();
	}
	
	//getters and setters [Department]
	public String getDepartment() {
		return this.department;
	}
	
	private String setDepartment() {
		String department = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your department:\n1-Sales\n2-Development\n3-Accounting\n4-None");
		department = input.next();
		
		//Sales\n2-Development\n3Accounting\n4-None"
		switch(department) {
		case "1":
			department = "Sales";

			break;
		case "2":
			department = "Development";

			break;
		case "3":
			department = "Accounting";

			break;
		case "4":
			department = "None";

			break;
		default:
			System.err.println("Invalid option");
			department = "";
			break;
		}
		input.close();
		return department;
	}
}
