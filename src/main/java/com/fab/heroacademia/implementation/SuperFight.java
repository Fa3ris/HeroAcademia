package com.fab.heroacademia.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._interface.Fight;

public class SuperFight implements Fight {
	
	private static final Logger logger = LoggerFactory.getLogger(SuperFight.class);

	public void punch() {
		logger.info("I PUNCH SUPER HARD!");

	}

	public void kick() {
		logger.info("I KICK SUPER HARD!");

	}

}
