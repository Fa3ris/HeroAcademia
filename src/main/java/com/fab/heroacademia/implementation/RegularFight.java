package com.fab.heroacademia.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._interface.Fight;

public class RegularFight implements Fight {

	private static final Logger logger = LoggerFactory.getLogger(RegularFight.class);
	
	public void punch() {
		logger.info("I punch normally");

	}

	public void kick() {
		logger.info("I kick normally");
	}

}
