package com.fab.heroacademia._pattern.structural.decorator.interventionDecorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.decorator.HeroIntervention;

public class MinimizeDamage extends BaseInterventionDecorator {
	
	private static final Logger logger = LoggerFactory.getLogger(MinimizeDamage.class);

	public MinimizeDamage(HeroIntervention hi) {
		super(hi);
	}
	
	@Override
	public void goSaveTheWorld() {
		logger.info("minimize damage");
		hi.goSaveTheWorld();

	}

}
