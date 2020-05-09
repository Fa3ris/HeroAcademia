package com.fab.heroacademia._pattern.creational.abstract_factory.product.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.creational.abstract_factory.product.Writer;

public class ComputerWriter  implements Writer{

	private static final Logger logger = LoggerFactory.getLogger(BookWriter.class);
	@Override
	public void write(String input) {

		logger.info("write to disk");
	}

}
