package com.fab.heroacademia._pattern.creational.factory_method.creator.impl;

import com.fab.heroacademia._pattern.creational.factory_method.creator.ArmorCreator;
import com.fab.heroacademia._pattern.creational.factory_method.product.Armor;
import com.fab.heroacademia._pattern.creational.factory_method.product.impl.FireArmor;

public class FireArmorCreator extends ArmorCreator {

	@Override
	public Armor createArmor() {
		
		return new FireArmor();
	}

}
