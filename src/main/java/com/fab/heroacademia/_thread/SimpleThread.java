package com.fab.heroacademia._thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleThread extends Thread {

	private static final Logger logger = LoggerFactory.getLogger(SimpleThread.class);
	
	public SimpleThread(String name) {
		super(name);
		log();
	}
	
	
	@Override
	public void run() {
		log();
		for (int i = 0; i < 10; i++) {
			logger.info("{} {}", getName(), i);
			log();
		}
		log();
	}
	
	
	private void log() {
		logger.info("{} au statut {}", getName(), getState());
	}
	
	

}
