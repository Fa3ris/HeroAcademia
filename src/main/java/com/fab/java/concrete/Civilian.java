package com.fab.java.concrete;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.java._abstract.Person;
import com.fab.java._interface.Fight;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Civilian extends Person implements Fight {
	
	private static final Logger logger = LoggerFactory.getLogger(Civilian.class);
	
	
	@Override
	public void greet() {	
		logger.info("Hi! I'm a civilian. I am rank {}", this.rank);
	}


}
