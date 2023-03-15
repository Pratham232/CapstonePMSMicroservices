package com.capstone.application.controller;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.application.model.Prescription;
import com.capstone.application.model.Tests;
import com.capstone.application.model.VisitDetails;
import com.capstone.application.service.PatientHealthRecordService;

@RestController
public class PatientHealthRecordController {
	
	private PatientHealthRecordService patientHealthRecordService;
	
	
	public PatientHealthRecordController(PatientHealthRecordService patientHealthRecordService) {
		super();
		this.patientHealthRecordService = patientHealthRecordService;
	}

	@GetMapping("/patient/{patientId}/health-records")
	public Optional<VisitDetails> healthRecordsById(@PathVariable int patientId) 
	{
        Optional < VisitDetails > optional = patientHealthRecordService.findById(patientId);
		return optional;
	}
	
	@PostMapping("/patient/{patientId}/health-records")
	 public VisitDetails updatePatientInfo(@RequestBody VisitDetails visitDetails) {
		VisitDetails updateResponse = patientHealthRecordService.update(visitDetails);
        return updateResponse;
	}
	
	@PutMapping("/patient/{patientId}/health-records")
	public VisitDetails updatePatientInforDoctors(@RequestBody VisitDetails visitDetails) {
		VisitDetails updateResponse = patientHealthRecordService.update(visitDetails);
        return updateResponse;
	}
	
	@PostMapping("/patient/{visitId}/tests")
	public Tests updateTest(@RequestBody Tests tests)
	{
		Tests updateResponse=patientHealthRecordService.updateforTest(tests);
		return updateResponse;
		
	}
	
	@PostMapping("/patient/{visitId}/prescription")
	public Prescription updatePrescription(@RequestBody Prescription prescription) {
		Prescription updateResponse=patientHealthRecordService.updatePrescription(prescription);
		return updateResponse;
	}
}
