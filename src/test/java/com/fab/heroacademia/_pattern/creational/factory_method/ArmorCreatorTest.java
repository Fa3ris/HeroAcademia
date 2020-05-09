package com.fab.heroacademia._pattern.creational.factory_method;

import org.junit.Test;

import com.fab.heroacademia._pattern.creational.factory_method.creator.ArmorCreator;
import com.fab.heroacademia._pattern.creational.factory_method.creator.impl.FireArmorCreator;
import com.fab.heroacademia._pattern.creational.factory_method.creator.impl.LightningArmorCreator;

public class ArmorCreatorTest {

	
	@Test
	public void createArmorsTest() {
		ArmorCreator fireCreator = new FireArmorCreator();
		ArmorCreator lightningCreator = new LightningArmorCreator();
		
		fireCreator.useArmor();
		lightningCreator.useArmor();
	}
}
