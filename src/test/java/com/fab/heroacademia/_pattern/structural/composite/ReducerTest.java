package com.fab.heroacademia._pattern.structural.composite;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.composite.container.Squad;
import com.fab.heroacademia._pattern.structural.composite.container.Unit;
import com.fab.heroacademia._pattern.structural.composite.unit.BaseSoldier;
import com.fab.heroacademia._pattern.structural.composite.unit.EliteSoldier;

public class ReducerTest {

	private static final Logger logger = LoggerFactory.getLogger(ReducerTest.class);
	@Test
	public void reducerTest() {
		List<BaseSoldier> soldiers1 = new ArrayList<BaseSoldier>();
		for (int i = 0; i < 10; i++) { // 10*1 = 10 
			soldiers1.add(new BaseSoldier());
		}
		
		List<BaseSoldier> soldiers2 = new ArrayList<BaseSoldier>();
		for (int i = 0; i < 10; i++) { // 10*1 = 10
			soldiers2.add(new BaseSoldier());
		}
		
		List<EliteSoldier> eliteSoldiers1 = new ArrayList<EliteSoldier>();
		for (int i = 0; i < 10; i++) { // 10*5 = 50
			eliteSoldiers1.add(new EliteSoldier());
		}
		
		List<EliteSoldier> eliteSoldiers2 = new ArrayList<EliteSoldier>();
		for (int i = 0; i < 10; i++) { // 10*5 = 50
			eliteSoldiers2.add(new EliteSoldier());
		}
		
		Unit basicUnit = new Unit();
		
		basicUnit.addChildren(soldiers1);
		basicUnit.addChildren(soldiers2);
		
		Unit eliteUnit = new Unit();
		eliteUnit.addChildren(eliteSoldiers1);
		eliteUnit.addChildren(eliteSoldiers2);
		
		List<Unit> units = new ArrayList<Unit>(Arrays.asList(basicUnit, eliteUnit));
		
		Squad squad = new Squad();
		squad.addChildren(units);
		
		int res = squad.count();
		
		logger.info("res = {}", res);
		assertTrue(res == 120);
		
	}
}
