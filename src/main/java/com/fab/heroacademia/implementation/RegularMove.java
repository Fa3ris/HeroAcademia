package com.fab.heroacademia.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._interface.Move;

public class RegularMove implements Move {
	
	private static final Logger logger = LoggerFactory.getLogger(RegularMove.class);

	public void walk() {
		logger.info("I walk normally");

	}

	public void fly() {

		logger.info("I cannot fly");
	}

	public void jump() {

		logger.info("I jump normally");
	}

}
