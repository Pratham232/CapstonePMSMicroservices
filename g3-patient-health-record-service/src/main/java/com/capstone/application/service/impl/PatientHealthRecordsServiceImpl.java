package com.capstone.application.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capstone.application.model.VisitDetails;
import com.capstone.application.repository.PatietHealthRecordsRepository;
import com.capstone.application.service.PatientHealthRecordService;


@Service
public class PatientHealthRecordsServiceImpl implements PatientHealthRecordService {

	private PatietHealthRecordsRepository patientHealthRecordsRepository;
	
	public PatientHealthRecordsServiceImpl(PatietHealthRecordsRepository patientHealthRecordsRepository) {
		super();
		this.patientHealthRecordsRepository = patientHealthRecordsRepository;
	}

	@Override
	public Optional<VisitDetails> findById(Integer visitId) {
		// TODO Auto-generated method stub
		
		return  patientHealthRecordsRepository.findById(visitId);
	}

	@Override
	public VisitDetails update(VisitDetails visitDetails) {
		// TODO Auto-generated method stub
		VisitDetails updateResponse = patientHealthRecordsRepository.save(visitDetails);
        return updateResponse;
	}

}
