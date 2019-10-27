package com.EmailApplication.model;

import java.util.Scanner;

public class Email {
	//Encapsulating properties
	final int PASSWORDLENGTH = 14;
	private String firstName;
	private String lastName;
	private String password;
	private String secretPhrase;
	private String department;
	private String alternativeEmail;
	private int mailBoxCapacity;
	
	//constructors
	public Email(){}
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Calling method to set the department
		this.department = this.setDepartment();
		
		//generating a random password
		this.secretPhrase = "";
		this.password = this.setRandomPassword();
	}
	
	//getters and setters [Department]
	public String getDepartment() {
		return this.department;
	}
	
	private String setDepartment() {
		String department = "";
		Scanner input = new Scanner(System.in);
		System.out.println("--Department codes--");
		System.out.println("1-Sales\n2-Development\n3-Accounting\n0-None");
		System.out.println("Please enter your department code:\n");
		department = input.next();
		
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
		case "0":
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
	
	//getters and setters password
	public String getPassword(String secretPhrase) {
		if(secretPhrase == this.secretPhrase) {
			return this.password;
		}else {
			return "Wrong secret phrase!!!";
		}
	}
	
	private String setRandomPassword() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialChar = "0123456789*/-_)(&%$#!|<>";
		String passwordSet = alphabet.toLowerCase() + alphabet + specialChar;
		char[] password = new char[PASSWORDLENGTH];
		for(int i=0; i<PASSWORDLENGTH; i++) {
			int randomCharacter = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomCharacter);
		}
		return new String (password);
	}
}
