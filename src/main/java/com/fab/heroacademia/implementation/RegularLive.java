package com.fab.heroacademia.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._interface.Live;

public class RegularLive implements Live {
	
	private static final Logger logger = LoggerFactory.getLogger(RegularLive.class);

	public void eat() {
		logger.info("I eat");

	}

	public void drink() {
		logger.info("I drink");

	}

	public void sleep() {

		logger.info("I sleep");
	}

}
