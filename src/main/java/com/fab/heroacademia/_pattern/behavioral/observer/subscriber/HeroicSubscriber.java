package com.fab.heroacademia._pattern.behavioral.observer.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.observer.publisher.AlertLevel;
import com.fab.heroacademia._pattern.behavioral.observer.publisher.AlertPublisher;

public class HeroicSubscriber implements AlertSubscriber {

	private static final Logger logger = LoggerFactory.getLogger(HeroicSubscriber.class);
	
	private String name;
	
	public HeroicSubscriber(String name) {
		this.name = name;
	}
	
	@Override
	public void update(AlertLevel level) {
		
		switch (level) {
		case WOLF:
		case TIGER:
		case DEMON:
			logger.info("{} - Here I come!", name);
			break;
		case DRAGON:
			logger.info("{} - Not so sure ...", name);
			break;
		case GOD:
			logger.info("{} - Forget it man", name);
			break;
		}		
	}

}
