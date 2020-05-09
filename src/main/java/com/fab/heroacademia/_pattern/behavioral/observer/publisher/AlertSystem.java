package com.fab.heroacademia._pattern.behavioral.observer.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlertSystem {

	private static final Logger logger = LoggerFactory.getLogger(AlertSystem.class);
	
	private AlertPublisher publisher;
	
	
	
	public AlertSystem(AlertPublisher publisher) {
		this.publisher = publisher;
	}
	
	
	public void createAlert(AlertLevel level) {
		logger.info("----------- CREATE ALERT OF LEVEL {} --------------", level);
		int count = publisher.notify(level);
		logger.info("----------- {} subscribers notified --------------", count);
		
	}
}
