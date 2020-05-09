package com.fab.heroacademia._pattern.behavioral.observer.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.observer.publisher.AlertLevel;

public class JournalistSubscriber implements AlertSubscriber {

	private static final Logger logger = LoggerFactory.getLogger(JournalistSubscriber.class);
	
	@Override
	public void update(AlertLevel level) {
		
		logger.info("another alert of level {} appeared !", level);
	}

}
