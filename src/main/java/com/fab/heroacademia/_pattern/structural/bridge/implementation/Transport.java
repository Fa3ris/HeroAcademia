package com.fab.heroacademia._pattern.structural.bridge.implementation;

public interface Transport {
	
	 boolean isStarted();
	 void start();
	 void stop();
	 boolean canStart();
	 
	 void move();
	 boolean canMove();
	 
	 void refillEnergy(int amount);

}
