package com.fab.java.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.java._interface.WeaponUse;


public class Slash implements WeaponUse {

	private static Logger logger = LoggerFactory.getLogger(Slash.class);
	@Override
	public void use() {
		logger.info("SLASH !!!");

	}

}
