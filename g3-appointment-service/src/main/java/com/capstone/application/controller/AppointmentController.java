package com.capstone.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.application.model.Appointment;
import com.capstone.application.service.AppointmentService;


@RestController
public class AppointmentController {
	
	private AppointmentService appointmentService;
	

	public AppointmentController(AppointmentService appointmentService) {
		super();
		this.appointmentService = appointmentService;
	}

	@GetMapping("/patient/{patientId}/appointments")
	public Optional<Appointment> appointmetForPatientId(@PathVariable int patientId)
	{
		return appointmentService.findByAppointmentById(patientId);
	}
	
	@GetMapping("/appointment/{physicianEmail}")
	public List<Appointment> pendingAppointmentByEmail(@PathVariable String physicianEmail,@RequestParam String acceptance) {
		return appointmentService.findByAppointmentByPEmail(physicianEmail,acceptance);
	} 
	
	@GetMapping("/appointment/{email}/{date}")
	public List<Appointment> AcceptedAppointmentByEmail(@PathVariable String physicianEmail, @PathVariable String date) {
		return null;
//		return appointmentService.findByAppointmentByPEmail(physicianEmail);
	}
	
	@GetMapping("/appointment")
	public String acceptedAppointmentForNurse(@RequestParam String acceptance)
	{
		return "All the accepted appointments";
	}
	
	@PostMapping("/appointment")
	public String appointment()
	{
		return "Appointment Details";
	}
	
	@PutMapping("/appointment/{appointmentId}")
	public String appointmentById(@PathVariable int appointmentId) {
		return "Appointment Id Recieved "+appointmentId;
	}
	
	@DeleteMapping("/appointment/{appointmentId}")
	public String deleteAppointmentById(@PathVariable int appointmentId)
	{
		return "Appointment Deleted from this id "+ appointmentId;
	}

}
