package com.fab.heroacademia._pattern.behavioral.strategy.context;

import com.fab.heroacademia._pattern.behavioral.strategy.train_strategy.TrainStrategy;

public class Training {
	
	private TrainStrategy strat;
	
	public Training(TrainStrategy strat) {
		this.strat = strat;
	}
	
	public void train() {
		this.strat.train();
	}

}
