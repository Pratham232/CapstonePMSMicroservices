package com.capstone.application.controller;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.application.model.Patient;
import com.capstone.application.service.PatientAuthenticationService;

@RestController
public class AuthenticationServiceController {

	private PatientAuthenticationService patientAuthenticationService;
	
	
	public AuthenticationServiceController(PatientAuthenticationService patientAuthenticationService) {
		super();
		this.patientAuthenticationService = patientAuthenticationService;
	}

	@PostMapping("/patient/login/{email}/{password}")
	public ResponseEntity<?>login(@PathVariable String email, @PathVariable String password)
	{
		Optional<Patient> patient=patientAuthenticationService.patientLogin(email, password);
		return ResponseEntity.ok(patient);
		
	}
		
	@PostMapping("/patient/register")
	public Patient patientRegister( @RequestBody Patient patient)
	{
		return patientAuthenticationService.save(patient);
	}
}
