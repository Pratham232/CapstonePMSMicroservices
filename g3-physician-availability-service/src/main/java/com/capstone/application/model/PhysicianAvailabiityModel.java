package com.capstone.application.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="physician_availability",schema="physician_availability_db")
public class PhysicianAvailabiityModel 
{
	@Id
	@Column(name="physician_email")
	private String physicianEmail;
	
	@Column(name="date")
	private String date;
	
	@Column(name="availability")
	private boolean availability;
	
	
	

	public PhysicianAvailabiityModel() {
		super();
	}

	public PhysicianAvailabiityModel(String physicianEmail, String date, boolean availability) {
		super();
		this.physicianEmail = physicianEmail;
		this.date = date;
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "PhysicianAvailabiityModel [physicianEmail=" + physicianEmail + ", date=" + date + ", availability="
				+ availability + "]";
	}

	public String getPhysicianEmail() {
		return physicianEmail;
	}

	public void setPhysicianEmail(String physicianEmail) {
		this.physicianEmail = physicianEmail;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	
	
}
