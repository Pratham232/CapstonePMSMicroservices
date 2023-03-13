package com.capstone.application.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capstone.application.model.Appointment;
import com.capstone.application.repository.AppointmentRepository;
import com.capstone.application.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	private AppointmentRepository appointmentRepository;

	public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}

	@Override
	public Optional<Appointment> findByAppointmentById(Integer patientId) {
		// TODO Auto-generated method stub
		return appointmentRepository.findById(patientId);
	}

	@Override
	public List<Appointment> findByAppointmentByPEmail(String physicianEmail,String acceptance) {
		// TODO Auto-generated method stub
		return appointmentRepository.findByEmail(physicianEmail,acceptance);
	}

	
}
