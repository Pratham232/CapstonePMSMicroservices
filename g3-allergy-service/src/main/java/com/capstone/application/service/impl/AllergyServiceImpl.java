package com.capstone.application.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.capstone.application.model.Allergy;
import com.capstone.application.repository.AllergyRepository;
import com.capstone.application.service.AllergyService;



@Service
public class AllergyServiceImpl implements AllergyService {
	
	
	private AllergyRepository allergyRepository;
	
	
	
	public AllergyServiceImpl(AllergyRepository allergyRepository) {
		super();
		this.allergyRepository = allergyRepository;
	}	

	@Override
	public List<Allergy> findAll() {
		// TODO Auto-generated method stub
		return allergyRepository.findAll();
	}

	@Override
	public Optional<Allergy> findById(Integer allergyId) {
		// TODO Auto-generated method stub
		return allergyRepository.findById(allergyId);
	}

}
