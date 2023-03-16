package com.capstone.application.service;

import java.util.List;

import com.capstone.application.dto.PhysicianAvailabilityDto;
import com.capstone.application.model.PhysicianAvailabilityModel;

public interface PhysicianAvailabilityService {
	public List<PhysicianAvailabilityModel> findAll();
    public boolean deletePhysician(String physicianEmail);
    public PhysicianAvailabilityDto updateAvailabilty(String physicianEmail,PhysicianAvailabilityDto physicianAvailabilityDto);
	public PhysicianAvailabilityDto createAvailability(PhysicianAvailabilityDto physicianAvailabilityDto);
}
