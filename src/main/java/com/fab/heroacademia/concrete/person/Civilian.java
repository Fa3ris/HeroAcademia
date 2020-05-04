package com.fab.heroacademia.concrete.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._abstract.Person;
import com.fab.heroacademia._interface.Fight;
import com.fab.heroacademia.concrete.weapon.Fist;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Civilian extends Person implements Fight {
	
	private static final Logger logger = LoggerFactory.getLogger(Civilian.class);
	
	
	public Civilian() {
		super();
		this.weapon = new Fist();
	}
	
	@Override
	public void greet() {	
		logger.info("Hi! I'm a civilian. I am rank {}", this.rank);
	}


}
