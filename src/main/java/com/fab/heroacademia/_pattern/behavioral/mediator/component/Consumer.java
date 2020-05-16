package com.fab.heroacademia._pattern.behavioral.mediator.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consumer{

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	public void react() {
		logger.info("react to event !!!");
		
	}
}
