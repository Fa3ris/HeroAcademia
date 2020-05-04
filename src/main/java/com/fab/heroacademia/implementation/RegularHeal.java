package com.fab.heroacademia.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._interface.Heal;

public class RegularHeal implements Heal {
	
	private static final Logger logger = LoggerFactory.getLogger(RegularHeal.class);

	public void heal() {
		logger.info("I heal normally");
	}

	public void resurrect() {
		logger.info("I cannot resurrect");

	}

}
