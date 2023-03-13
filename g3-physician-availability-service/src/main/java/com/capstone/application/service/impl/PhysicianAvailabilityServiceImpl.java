package com.capstone.application.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.capstone.application.model.PhysicianAvailabiityModel;
import com.capstone.application.repository.PhysicianAvailabilityRepository;
import com.capstone.application.service.PhysicianAvailabilityService;

@Service
public class PhysicianAvailabilityServiceImpl implements PhysicianAvailabilityService{
	
	private PhysicianAvailabilityRepository physicianAvailabilityRepository;

	public PhysicianAvailabilityServiceImpl(PhysicianAvailabilityRepository physicianAvailabilityRepository) {
		super();
		this.physicianAvailabilityRepository = physicianAvailabilityRepository;
	}

	@Override
	public List<PhysicianAvailabiityModel> findAll() {
		// TODO Auto-generated method stub
		return physicianAvailabilityRepository.findAll();
	}
	
	public PhysicianAvailabiityModel update(PhysicianAvailabiityModel physicianAvailabiity) {
		// TODO Auto-generated method stub
		PhysicianAvailabiityModel updateResponse = physicianAvailabilityRepository.save(physicianAvailabiity);
        return updateResponse;
	}

	@Override
	public boolean deletePhysician(String physicianEmail) {
		// TODO Auto-generated method stub
		physicianAvailabilityRepository.deleteById(physicianEmail);
		return true;
	}

	
}
