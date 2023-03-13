package com.capstone.application.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.capstone.application.model.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

	@Query(value = "SELECT * from Appointment where physician_email=?1 and acceptance=?2", nativeQuery=true)
	List<Appointment> findByEmail(String physicianEmail,String acceptance);

}
