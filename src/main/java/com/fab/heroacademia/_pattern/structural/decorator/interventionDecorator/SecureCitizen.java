package com.fab.heroacademia._pattern.structural.decorator.interventionDecorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.decorator.HeroIntervention;

public class SecureCitizen extends BaseInterventionDecorator {
	
	private static final Logger logger = LoggerFactory.getLogger(SecureCitizen.class);

	public SecureCitizen(HeroIntervention hi) {
		super(hi);
	}
	
	@Override
	public void goSaveTheWorld() {
		logger.info("secure citizens");
		hi.goSaveTheWorld();

	}

}
