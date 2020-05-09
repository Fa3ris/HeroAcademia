package com.fab.heroacademia._pattern.creational.factory_method.product.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.creational.factory_method.product.Armor;

public class LightningArmor implements Armor {

	private static final Logger logger = LoggerFactory.getLogger(LightningArmor.class);
	
	@Override
	public void use() {
		logger.info("I protect against LIGHTNING");
	}

}
