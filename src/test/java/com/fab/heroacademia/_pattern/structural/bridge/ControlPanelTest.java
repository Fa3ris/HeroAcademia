package com.fab.heroacademia._pattern.structural.bridge;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.bridge.abstraction.ControlPanel;
import com.fab.heroacademia._pattern.structural.bridge.implementation.Car;
import com.fab.heroacademia._pattern.structural.bridge.implementation.SpaceShip;
import com.fab.heroacademia._pattern.structural.bridge.implementation.Transport;

public class ControlPanelTest {
	
	private static final Logger logger = LoggerFactory.getLogger(ControlPanelTest.class);
	
	private ControlPanel cp;
	
	private Transport t;
	
	
	@Test
	public void testCar() {
		logger.info("------------- TEST CAR START -----------------");
		t = new Car();
		cp = new ControlPanel(t);
		cp.advance();
		cp.togglePower();
		for (int i = 0; i < 10; i++) {
			
			cp.advance();
		}
		
		cp.togglePower();
		logger.info("------------- TEST CAR END -----------------");
	}
	
	
	@Test
	public void testSpaceShip() {
		logger.info("------------- TEST SPACESHIP START -----------------");
		t = new SpaceShip();
		cp = new ControlPanel(t);
		cp.advance();
		cp.togglePower();
		for (int i = 0; i < 20; i++) {
			
			cp.advance();
		}
		
		cp.togglePower();
		
		logger.info("------------- TEST SPACESHIP END-----------------");
	}

}
