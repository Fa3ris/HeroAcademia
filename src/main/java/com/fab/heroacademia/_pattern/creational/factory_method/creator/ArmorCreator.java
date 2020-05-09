package com.fab.heroacademia._pattern.creational.factory_method.creator;

import com.fab.heroacademia._pattern.creational.factory_method.product.Armor;

public abstract class ArmorCreator {
	
	protected Armor armor;
	
	protected abstract Armor createArmor();
	
	public void useArmor() {
		Armor a = createArmor();
		a.use();
	}

}
