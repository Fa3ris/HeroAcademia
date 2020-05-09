package com.fab.heroacademia._pattern.behavioral.iterator;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.iterator.collection.City;
import com.fab.heroacademia._pattern.behavioral.iterator.collection.Paris;
import com.fab.heroacademia._pattern.behavioral.iterator.collection.PointOfInterest;

public class CityIteratorTest {
	
	private static final Logger logger = LoggerFactory.getLogger(CityIteratorTest.class);
	
	private City city;
	private CityIterator it;
	
	@Before
	public void setup() {
		city = new Paris();
	}
	
	@Test()
	public void nameIteratorTest() {
		
		logger.info("----------- NAME ITERATOR START -----------");
		PointOfInterest poi;
		it = city.getNameIterator();
		
		while(it.hasNext()) {
			poi = it.getNext();
			logger.info(poi.toString());
			
		}
		logger.info("----------- NAME ITERATOR END -----------");
		
	}
	
	
	@Test()
	public void levelIteratorTest() {
		
		logger.info("----------- LEVEL ITERATOR START -----------");
		PointOfInterest poi;
		it = city.getLevelIterator();
		
		while(it.hasNext()) {
			poi = it.getNext();
			logger.info(poi.toString());
			
		}
		logger.info("----------- LEVEL ITERATOR END -----------");
		
	}

}
