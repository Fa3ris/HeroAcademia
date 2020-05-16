package com.fab.heroacademia._pattern.structural.decorator.interventionDecorator;

import com.fab.heroacademia._pattern.structural.decorator.HeroIntervention;

public abstract class BaseInterventionDecorator implements HeroIntervention {

	protected HeroIntervention hi;
	
	public BaseInterventionDecorator(HeroIntervention hi) {
		this.hi = hi;
	}
	
	@Override
	public void goSaveTheWorld() {
		hi.goSaveTheWorld();

	}

}
