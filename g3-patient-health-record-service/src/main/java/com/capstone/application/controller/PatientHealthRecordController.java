package com.capstone.application.controller;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capstone.application.model.VisitDetails;
import com.capstone.application.service.PatientHealthRecordService;

@RestController
public class PatientHealthRecordController {
	
	private PatientHealthRecordService patientHealthRecordService;
	
	
	public PatientHealthRecordController(PatientHealthRecordService patientHealthRecordService) {
		super();
		this.patientHealthRecordService = patientHealthRecordService;
	}

	@GetMapping("/patient/{visitId}/health-records")
	public Optional<VisitDetails> allergyById(@PathVariable int visitId) 
	{
        Optional < VisitDetails > optional = patientHealthRecordService.findById(visitId);
		return optional;
	}
	
	@PostMapping("/patient/{visitId}/health-records")
	 public VisitDetails updatePatientInfo(@RequestBody VisitDetails visitDetails) {
		VisitDetails updateResponse = patientHealthRecordService.update(visitDetails);
        return updateResponse;
	}
	
	@PutMapping("/patient/{visitId}/health-records")
	public VisitDetails updatePatientInforDoctors(@RequestBody VisitDetails visitDetails) {
		VisitDetails updateResponse = patientHealthRecordService.update(visitDetails);
        return updateResponse;
	}
}
