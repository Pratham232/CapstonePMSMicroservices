package com.capstone.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient", schema="patient_info_db")
public class Patient 
{
	@Id
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="title")
	private String title;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="age")
	private String age;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="address")
	private String address;
	
	

	public Patient() {
		super();
	}

	public Patient(int patientId, String email, String title, String firstName, String lastName, String age,
			String contactNumber, String password, String gender, String address) {
		super();
		this.patientId = patientId;
		this.email = email;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.contactNumber = contactNumber;
		this.password = password;
		this.gender = gender;
		this.address = address;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getage() {
		return age;
	}

	public void setage(String age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
