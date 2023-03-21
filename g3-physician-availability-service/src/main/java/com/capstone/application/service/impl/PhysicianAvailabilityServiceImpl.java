package com.capstone.application.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.application.dto.PhysicianAvailabilityDto;
import com.capstone.application.model.PhysicianAvailabilityModel;
import com.capstone.application.repository.PhysicianAvailabilityRepository;
import com.capstone.application.service.PhysicianAvailabilityService;

import lombok.extern.log4j.Log4j2;


@Service
@Log4j2
public class PhysicianAvailabilityServiceImpl implements PhysicianAvailabilityService{
	private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(PhysicianAvailabilityServiceImpl.class);

	
	@Autowired
	private ModelMapper modelmapper;
	
	private PhysicianAvailabilityRepository physicianAvailabilityRepository;

	public PhysicianAvailabilityServiceImpl(PhysicianAvailabilityRepository physicianAvailabilityRepository) {
		super();
		this.physicianAvailabilityRepository = physicianAvailabilityRepository;
	}

	@Override
	public List<PhysicianAvailabilityModel> findAll() {
		// TODO Auto-generated method stub
		try {
		return physicianAvailabilityRepository.findAll();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.error(e.getMessage());
		}
		return null;
	}
	
	@Override
	public boolean deletePhysician(String physicianEmail) {
		// TODO Auto-generated method stub
		try {
		physicianAvailabilityRepository.deleteById(physicianEmail);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.error(e.getMessage());
		}
		return false;
	}

	@Override
	public PhysicianAvailabilityDto createAvailability(PhysicianAvailabilityDto physicianAvailabilityDto) {
		
		try {
		PhysicianAvailabilityModel physicianAvailabiity=modelmapper.map(physicianAvailabilityDto, PhysicianAvailabilityModel.class);
		PhysicianAvailabilityModel savedAvailability=physicianAvailabilityRepository.save(physicianAvailabiity);
		PhysicianAvailabilityDto savedAvailabilityDto=modelmapper.map(savedAvailability, PhysicianAvailabilityDto.class);
		return savedAvailabilityDto;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.error(e.getMessage());
		}
		return null;
	}

	@Override
	public PhysicianAvailabilityDto updateAvailabilty(String physicianEmail,PhysicianAvailabilityDto physicianAvailabilityDto) {

		try {
		PhysicianAvailabilityModel currentAvailability = physicianAvailabilityRepository.findById(physicianEmail).get();
		currentAvailability.setFromDate(physicianAvailabilityDto.getFromDate());
		currentAvailability.setToDate(physicianAvailabilityDto.getToDate());
		currentAvailability.setAvailability(physicianAvailabilityDto.isAvailability());
		PhysicianAvailabilityModel updatedAvailability=physicianAvailabilityRepository.save(currentAvailability);
		physicianAvailabilityDto=modelmapper.map(updatedAvailability,PhysicianAvailabilityDto.class);
		return physicianAvailabilityDto;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.error(e.getMessage());
		}
		return null;
		
	}

	
}
