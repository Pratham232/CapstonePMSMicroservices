package com.capstone.application.service;

import java.util.Optional;

import com.capstone.application.model.Prescription;
import com.capstone.application.model.Tests;
import com.capstone.application.model.VisitDetails;

public interface PatientHealthRecordService {

	public Optional<VisitDetails> findById(Integer patientId);
    public VisitDetails update(VisitDetails visitDetails);
    public Prescription updatePrescription (Prescription prescripion);
	public Tests updateforTest(Tests tests);
}
