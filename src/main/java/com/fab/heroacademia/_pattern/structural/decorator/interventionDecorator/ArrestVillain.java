package com.fab.heroacademia._pattern.structural.decorator.interventionDecorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.decorator.HeroIntervention;

public class ArrestVillain extends BaseInterventionDecorator {
	
	private static final Logger logger = LoggerFactory.getLogger(ArrestVillain.class);

	public ArrestVillain(HeroIntervention hi) {
		super(hi);
	}
	
	@Override
	public void goSaveTheWorld() {
		logger.info("arrest villains");
		hi.goSaveTheWorld();

	}

}
