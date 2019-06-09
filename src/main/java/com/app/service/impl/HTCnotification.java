package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotification;
@Component
@Profile("htc")
public class HTCnotification implements INotification{

	@Override
	public void notificate() {
		System.out.println("htc notification");
		
	}

}
