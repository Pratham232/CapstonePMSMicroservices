package com.capstone.application.service;
import java.util.List;
import java.util.Optional;

import com.capstone.application.model.Appointment;

public interface AppointmentService 
{
		public Optional<Appointment> findByAppointmentById(Integer patientId);
		public List<Appointment> findByAppointmentByPEmail(String physicianEmail,String acceptance);


}
