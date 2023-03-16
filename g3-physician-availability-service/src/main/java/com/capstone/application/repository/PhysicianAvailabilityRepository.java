package com.capstone.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.application.model.PhysicianAvailabilityModel;

@Repository
public interface PhysicianAvailabilityRepository extends JpaRepository<PhysicianAvailabilityModel, String>{


}
