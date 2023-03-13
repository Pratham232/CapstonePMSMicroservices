package com.capstone.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.application.model.Allergy;
import com.capstone.application.service.AllergyService;



@RestController
public class AllergyController 
{	
	
	
    private AllergyService allergyService;
    
	
	public AllergyController(AllergyService allergyService) {
		super();
		this.allergyService = allergyService;
	}

	@GetMapping("/allergy")
	public List<Allergy> allergy() 
	{
		List < Allergy > allergy = allergyService.findAll();
		return allergy;
	}
	
	
	@GetMapping("/allergy/{allergyId}")
	public Optional<Allergy> allergyById(@PathVariable int allergyId) 
	{
        Optional < Allergy > optional = allergyService.findById(allergyId);
		return optional;
	}
	
	
	
	
	
}
