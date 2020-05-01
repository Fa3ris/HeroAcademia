package com.fab.java._generic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.java._enum.Element;

public class Magic<T extends Enum<Element>> {
	
	private static final Logger logger = LoggerFactory.getLogger(Magic.class);
	
	public void summonMagic(T element) {
		logger.info("I summon magic {}", element);		
	}
	
	
	public void summonMultipleMagics(List<T> elements) {
		for(T e : elements) {
			summonMagic(e);
		}
	}

}
