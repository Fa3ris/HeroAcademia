package com.fab.heroacademia._pattern.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Excalibur {
	
	private static final Logger logger = LoggerFactory.getLogger(Excalibur.class);
	
	private Excalibur() {}
	
	private static Excalibur instance;
	
	public static Excalibur getInstance() {
		if (instance == null) {
			logger.info("create excalibur");
			instance = new Excalibur();
		}
		
		return instance;
	}

}
