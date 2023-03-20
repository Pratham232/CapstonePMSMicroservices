package com.capstone.application.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.capstone.application.model.Allergy;
import com.capstone.application.repository.AllergyRepository;
import com.capstone.application.service.AllergyService;

import lombok.extern.log4j.Log4j2;



@Service
@Log4j2
public class AllergyServiceImpl implements AllergyService {
	private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(AllergyServiceImpl.class);

	
	private AllergyRepository allergyRepository;
	
	
	
	public AllergyServiceImpl(AllergyRepository allergyRepository) {
		super();
		this.allergyRepository = allergyRepository;
	}	

	@Override
	public List<Allergy> findAll() {
		// TODO Auto-generated method stub
		try {
		return allergyRepository.findAll();
		}
		catch(Exception e)
		{
			log.error(e.getMessage());
			throw new Exception("Unable to fetch record");
		}
		
	}

	@Override
	public Optional<Allergy> findById(Integer allergyId) {
		// TODO Auto-generated method stub
		try {
		return allergyRepository.findById(allergyId);
		}
		catch(Exception e)
		{
			log.error(e.getMessage());
			throw new Exception("Unable to fetch record");
		}
	}

}
