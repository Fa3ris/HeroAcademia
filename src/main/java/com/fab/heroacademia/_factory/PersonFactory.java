package com.fab.heroacademia._factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._abstract.Person;
import com.fab.heroacademia._enum.PersonType;
import com.fab.heroacademia._interface.AbstractFactory;
import com.fab.heroacademia.concrete.person.Civilian;
import com.fab.heroacademia.concrete.person.Hero;
import com.fab.heroacademia.concrete.weapon.Sword;

public class PersonFactory implements AbstractFactory<Person, PersonType> {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonFactory.class);

	private PersonFactory() {}
	
	private static PersonFactory instance = new PersonFactory();
	
	public static PersonFactory getInstance() {
		return instance;
	}
	
	@Override
	public  Person create(PersonType type) throws IllegalArgumentException {
		switch (type) {
		case CIVILIAN :
			logger.info("create Civilian");
			return new Civilian();
			
		case HERO :
			logger.info("create Hero");
			return new Hero(new Sword());
		default:
			throw new IllegalArgumentException(type + " not supported");
		}
	}

}
