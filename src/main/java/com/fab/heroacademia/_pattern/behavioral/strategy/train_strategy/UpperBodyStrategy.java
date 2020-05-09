package com.fab.heroacademia._pattern.behavioral.strategy.train_strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpperBodyStrategy implements TrainStrategy {
	
	private static final Logger logger = LoggerFactory.getLogger(UpperBodyStrategy.class);

	@Override
	public void train() {
		logger.info("Training only upper body"); 

	}

}
