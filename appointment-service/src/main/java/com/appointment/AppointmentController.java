package com.appointment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.entity.Appointment;

@RestController
public class AppointmentController {
	@PostMapping("/appointment")
	 void createAppointment(@RequestBody Appointment appointment ) {
		 System.out.println("created");
		 System.out.println(appointment);
	

	}

	}


