package com.hipstertech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	
	@Autowired
	ServiceLayerClient serviceLayerClient;

	@Scheduled(cron = "0 0/25 * * * ?")
	public void refreshLogin() {
		serviceLayerClient.login();
	}
}
