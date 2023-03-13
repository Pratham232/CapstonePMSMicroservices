package com.capstone.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.application.model.Patient;

public interface PatientAuthenticationRepository extends JpaRepository<Patient,Integer> {

	Optional<Patient> findByEmail(String email);

}
