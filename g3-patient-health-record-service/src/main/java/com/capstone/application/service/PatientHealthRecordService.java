package com.capstone.application.service;

import java.util.*;

import com.capstone.application.model.VisitDetails;

public interface PatientHealthRecordService {

	public Optional<VisitDetails> findById(Integer visitId);
    public VisitDetails update(VisitDetails visitDetails);


}
