package com.fab.heroacademia.concrete.person;

import java.util.Locale;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;

import com.fab.heroacademia._abstract.Person;
import com.fab.heroacademia._abstract.Weapon;
import com.fab.heroacademia._enum.Rank;
import com.fab.heroacademia.implementation.SuperFight;

import lombok.Data;

@Data
public class Hero extends Person {
	
	@Autowired
	Environment env;
	
	private MessageSource messageSource;
	
	@Value("${myName}")
	private String myName;

	private static final Logger logger = LoggerFactory.getLogger(Hero.class);

	private String lastName;
	
	
	public Hero(Weapon weapon) {
		super();
		this.fight = new SuperFight();
		this.rank = Rank.S;
		
		this.weapon = weapon;
	}
	
	public Hero(String lastName) {
		super(); 
		this.lastName = lastName; 
	}
	
	public void setMessageSource(MessageSource ms) {
		this.messageSource = ms;
	}

	/**
	 * méthode appelée après instantiation du bean
	 * à partir de JDK 11, doit inclure la dépendance <br>
	 * <strong>javax.annotation-api</strong>
	 */
	@PostConstruct
	public void init() {
		logger.info("Hero created");
		for (String p : this.env.getActiveProfiles()) {
			logger.info("Environment has profile " + p);
		}
		logger.info("my name is " + myName);
		
		Locale.setDefault(Locale.ITALIAN);
		
		logger.info(this.messageSource.getMessage("hello", null, Locale.JAPANESE));
		logger.info(this.messageSource.getMessage("hello", null, Locale.ENGLISH));
		logger.info(this.messageSource.getMessage("hello", null, Locale.FRENCH));
	}
	
	@Override
	public void greet() {
		logger.info("I am a {} rank hero", this.rank);

	}

}
