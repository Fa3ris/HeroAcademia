package com.fab.java.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.java._interface.WeaponUse;
import com.fab.java.concrete.person.Civilian;

public class Shoot implements WeaponUse {

	private static final Logger logger = LoggerFactory.getLogger(Shoot.class);
	
	@Override
	public void use() {
		logger.info("SHOOT !!!");

	}

}
