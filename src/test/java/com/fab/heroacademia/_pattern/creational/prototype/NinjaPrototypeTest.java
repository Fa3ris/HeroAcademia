package com.fab.heroacademia._pattern.creational.prototype;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NinjaPrototypeTest {
	
	private static final Logger logger = LoggerFactory.getLogger(NinjaPrototypeTest.class);
	@Test
	public void ninjaProtoTest() {
		NinjaPrototype ninja = new Ninja("Naruto", 1);
		
		logger.info(ninja.copy().toString());
		
		NinjaPrototype konohaNinja = new KonohaNinja("Minato", 100, "Namikaze");
		
		logger.info(konohaNinja.copy().toString());
		
	}

}
