package com.fab.heroacademia._pattern.creational.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void testIsUnique() {
		Excalibur e1 = Excalibur.getInstance();
		Excalibur e2 = Excalibur.getInstance();
		assertTrue("not same excalibur", e2 == e2);
	}

}
