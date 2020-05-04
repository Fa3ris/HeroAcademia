package com.fab.heroacademia.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ManaPoolTest {
	
	private ManaPool mp;
	
	private String dummyConsumer = "toto";
	
	@Before
	public void setup() {
		mp = new ManaPool(50);
	}
	
	
	@Test
	public void shouldHaveAmountLeft() {
		int amountLeft = mp.useMana(10, dummyConsumer);
		assertEquals("amount left not equal to 40", 40, amountLeft);
	}
	
	@Test
	public void shouldNotDecrease() {
		int res = mp.useMana(60, dummyConsumer);
		assertEquals("amount decrease is superior to quantity left", -1, res);
	}

}
