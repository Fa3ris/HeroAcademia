package com.fab.heroacademia._pattern.structural.decorator;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.decorator.intervention.BaseIntervention;
import com.fab.heroacademia._pattern.structural.decorator.interventionDecorator.ArrestVillain;
import com.fab.heroacademia._pattern.structural.decorator.interventionDecorator.MinimizeDamage;
import com.fab.heroacademia._pattern.structural.decorator.interventionDecorator.SecureCitizen;

public class HeroInterventionTest {

	private static final Logger logger = LoggerFactory.getLogger(HeroInterventionTest.class);
	
	@Test
	public void heroInterventionTest() {
		HeroIntervention hi1 = new ArrestVillain(new BaseIntervention());
		
		hi1.goSaveTheWorld();
		logger.info("---------------------------------");
		HeroIntervention hi2 = new SecureCitizen(
									new MinimizeDamage(
												new ArrestVillain(
														new BaseIntervention()
														)
												)
									);
		
		hi2.goSaveTheWorld();
	}
}
