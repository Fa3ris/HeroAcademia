package com.fab.heroacademia._pattern.behavioral.strategy.train_strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompleteBodyStrategy implements TrainStrategy {
	
	private static final Logger logger = LoggerFactory.getLogger(CompleteBodyStrategy.class);

	@Override
	public void train() {
		logger.info("warm-up"); 
		logger.info("stretching"); 
		logger.info("Training upper body"); 
		logger.info("Training lower body"); 

	}

}
