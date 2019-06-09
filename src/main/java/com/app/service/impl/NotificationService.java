package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotification;


@Component
@Profile("default")
public class NotificationService implements INotification {

	@Override
	public void notificate() {
	System.out.println("i am common for all");
		
	}

}
