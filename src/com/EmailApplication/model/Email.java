package com.EmailApplication.model;

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
	}
}
