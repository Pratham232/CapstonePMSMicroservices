package com.capstone.application.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capstone.application.model.Patient;
import com.capstone.application.repository.PatientAuthenticationRepository;
import com.capstone.application.service.PatientAuthenticationService;

@Service
public class PatientAuthenticationServiceImpl implements PatientAuthenticationService{

	private PatientAuthenticationRepository patientAuthenticationRepository;
	
	public PatientAuthenticationServiceImpl(PatientAuthenticationRepository patientAuthenticationRepository) {
		super();
		this.patientAuthenticationRepository = patientAuthenticationRepository;
	}

	@Override
	public Patient save(Patient patient) {
		return patientAuthenticationRepository.save(patient);

	}

	@Override
	public Optional<Patient> patientLogin(String email, String password) {
		// TODO Auto-generated method stub
		return patientAuthenticationRepository.authenticateByEmailandPassword(email,password);
		
	}

}
