package com.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.entity.Message;
import com.appointment.services.ContactService;
@RestController
public class ContactController {
	@Autowired
	ContactService service;
	
	@PostMapping("/contactus")
	 String receiveMessage(Message message) {
		 return service.saveMessage(message);
		
	 }
	 }
		