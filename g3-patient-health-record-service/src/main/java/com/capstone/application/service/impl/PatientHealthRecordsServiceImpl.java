package com.capstone.application.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.application.model.Prescription;
import com.capstone.application.model.Tests;
import com.capstone.application.model.VisitDetails;
import com.capstone.application.repository.PatietHealthRecordsRepository;
import com.capstone.application.repository.PrescriptionRepo;
import com.capstone.application.repository.TestRepo;
import com.capstone.application.service.PatientHealthRecordService;


@Service
public class PatientHealthRecordsServiceImpl implements PatientHealthRecordService {

	@Autowired
	private PatietHealthRecordsRepository patientHealthRecordsRepository;
	@Autowired
	private TestRepo testrepo;
	@Autowired
	private PrescriptionRepo prescriptionrepo;
	

	@Override
	public Optional<VisitDetails> findById(Integer patientId) {
		// TODO Auto-generated method stub
		
		return  patientHealthRecordsRepository.findById(patientId);
	}

	@Override
	public VisitDetails update(VisitDetails visitDetails) {
		// TODO Auto-generated method stub
		VisitDetails updateResponse = patientHealthRecordsRepository.save(visitDetails);
        return updateResponse;
	}

	@Override
	public Tests updateforTest(Tests tests) {
		// TODO Auto-generated method stub
		Tests updateResponse=testrepo.save(tests);
		return updateResponse;
	}

	@Override
	public Prescription updatePrescription(Prescription prescripion) {
		// TODO Auto-generated method stub
		Prescription updateResponse=prescriptionrepo.save(prescripion);
		return updateResponse;
	}
	


}
