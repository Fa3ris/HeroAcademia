package com.fab.java.concrete.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.java._abstract.Person;
import com.fab.java._enum.Rank;
import com.fab.java.implementation.SuperFight;

public class Hero extends Person {

	private static final Logger logger = LoggerFactory.getLogger(Hero.class);

	public Hero() {
		super();
		this.fight = new SuperFight();
		this.rank = Rank.S;
	}

	@Override
	public void greet() {
		logger.info("I am a {} rank hero", this.rank);

	}

}
