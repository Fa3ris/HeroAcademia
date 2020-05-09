package com.fab.heroacademia._pattern.structural.bridge.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpaceShip implements Transport {
	
	private static final Logger logger = LoggerFactory.getLogger(SpaceShip.class);

	private int energy = 100;

	private final int startCost = 10;
	
	private final int moveCost = 5;

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
		logger.info("spaceship moves");
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
