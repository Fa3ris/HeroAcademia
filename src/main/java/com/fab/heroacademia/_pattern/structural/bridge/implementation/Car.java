package com.fab.heroacademia._pattern.structural.bridge.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.bridge.abstraction.ControlPanel;

public class Car implements Transport {
	
	private static final Logger logger = LoggerFactory.getLogger(Car.class);

	private int energy = 10;

	private final int startCost = 2;
	
	private final int moveCost = 1;

	private boolean started = false;

	@Override
	public boolean isStarted() {
		return started;
	}
	
	@Override
	public boolean canStart() {
		return energy >= startCost;
	}
	
	@Override
	public void start() {
		energy -= startCost;
		started = true;
	}
	
	@Override
	public void stop() {
		started = false;
	}

	@Override
	public void move() {
		logger.info("car moves");
		energy -= moveCost;
	}

	@Override
	public boolean canMove() {
		return this.energy >= moveCost;
	}

	@Override
	public void refillEnergy(int amount) {
		this.energy += amount;
	}

}
