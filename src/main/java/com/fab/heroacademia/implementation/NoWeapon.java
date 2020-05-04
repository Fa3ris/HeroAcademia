package com.fab.heroacademia.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._interface.WeaponUse;

public class NoWeapon implements WeaponUse {

	private static final Logger logger = LoggerFactory.getLogger(Shoot.class);
	@Override
	public void use() {
		logger.info("No weapon equipped");

	}

}
