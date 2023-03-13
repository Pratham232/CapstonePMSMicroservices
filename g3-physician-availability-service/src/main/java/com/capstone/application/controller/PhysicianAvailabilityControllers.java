package com.capstone.application.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.capstone.application.model.PhysicianAvailabiityModel;
import com.capstone.application.service.PhysicianAvailabilityService;

@RestController
public class PhysicianAvailabilityControllers {
	
	private PhysicianAvailabilityService physicianAvailabilityService;
	
	public PhysicianAvailabilityControllers(PhysicianAvailabilityService physicianAvailabilityService) {
		super();
		this.physicianAvailabilityService = physicianAvailabilityService;
	}

	@GetMapping("/physician-availability")
	public List<PhysicianAvailabiityModel> AvailablePhysician() {
		List < PhysicianAvailabiityModel > availablePhysician = physicianAvailabilityService.findAll();
		
		return availablePhysician;
	}
	
	@GetMapping("/physician-avail")
	public List<PhysicianAvailabiityModel> AvailablePhysician1(@RequestParam boolean availability) {
		List < PhysicianAvailabiityModel > availablePhysician = physicianAvailabilityService.findAll();
		List<PhysicianAvailabiityModel> availableP=new ArrayList<>();
		for(PhysicianAvailabiityModel i:availablePhysician)
		{
			if(i.isAvailability()==availability) {
				System.out.println(i.getPhysicianEmail());
				availableP.add(i);
			}
			
			
		}
		
		return availableP;
	}
	
	@PostMapping("/physician-availability")
	public PhysicianAvailabiityModel updatedPhysicianAvailability(@RequestBody PhysicianAvailabiityModel physicianAvailabiity) 
	{
		PhysicianAvailabiityModel updateResponse = physicianAvailabilityService.update(physicianAvailabiity);
        return updateResponse;
	}
	
	@PutMapping("/physician-availability")
	public PhysicianAvailabiityModel updatedPhysicianAvailabilitys(@RequestBody PhysicianAvailabiityModel physicianAvailabiity) 
	{
		PhysicianAvailabiityModel updateResponse = physicianAvailabilityService.update(physicianAvailabiity);
        return updateResponse;
	}
	
	@DeleteMapping("/physician-availability/{physicianEmail}")
	public boolean deletePhysicianAvailability(@PathVariable("physicianEmail")String physicianEmail) {
		return physicianAvailabilityService.deletePhysician(physicianEmail);
	}
}
