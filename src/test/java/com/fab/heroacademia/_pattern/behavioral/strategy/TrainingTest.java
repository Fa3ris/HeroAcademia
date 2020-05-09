package com.fab.heroacademia._pattern.behavioral.strategy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.strategy.context.Training;
import com.fab.heroacademia._pattern.behavioral.strategy.train_strategy.CompleteBodyStrategy;
import com.fab.heroacademia._pattern.behavioral.strategy.train_strategy.TrainStrategy;
import com.fab.heroacademia._pattern.behavioral.strategy.train_strategy.UpperBodyStrategy;

public class TrainingTest {

	private static final Logger logger = LoggerFactory.getLogger(TrainingTest.class);

	private Training t;

	private TrainStrategy strat;

	@Test
	public void testUpperBody() {
		logger.info("------------- TEST UPPER BODY START -----------------");
		strat = new UpperBodyStrategy();
		t = new Training(strat);
		t.train();
		logger.info("------------- TEST UPPER BODY END -----------------");
	}

	@Test
	public void testCompleteBody() {
		logger.info("------------- TEST COMPLETE BODY START -----------------");
		strat = new CompleteBodyStrategy();
		t = new Training(strat);
		t.train();
		logger.info("------------- TEST COMPLETE BODY END -----------------");

	}
}
