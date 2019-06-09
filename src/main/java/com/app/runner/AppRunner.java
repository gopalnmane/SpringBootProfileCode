package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.INotification;
@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	private INotification service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		service.notificate();
	}

}
