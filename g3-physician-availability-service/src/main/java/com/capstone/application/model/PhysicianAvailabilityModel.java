package com.capstone.application.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="physician_availability",schema="physician_availability_db")
public class PhysicianAvailabilityModel 
{
	@Id
	@Column(name="physician_email")
	private String physicianEmail;
	
	@Column(name="from_date")
	private String fromDate;
	
	@Column(name="to_date")
	private String toDate;
	
	@Column(name="availability")
	private boolean availability;

	public PhysicianAvailabilityModel() {
		super();
	}

	public PhysicianAvailabilityModel(String physicianEmail, String fromDate, String toDate, boolean availability) {
		super();
		this.physicianEmail = physicianEmail;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.availability = availability;
	}

	public String getPhysicianEmail() {
		return physicianEmail;
	}

	public void setPhysicianEmail(String physicianEmail) {
		this.physicianEmail = physicianEmail;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	

}
