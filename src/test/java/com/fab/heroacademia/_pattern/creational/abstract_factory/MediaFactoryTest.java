package com.fab.heroacademia._pattern.creational.abstract_factory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.creational.abstract_factory.factory.MediaFactory;
import com.fab.heroacademia._pattern.creational.abstract_factory.factory.impl.BookFactory;
import com.fab.heroacademia._pattern.creational.abstract_factory.factory.impl.ComputerFactory;
import com.fab.heroacademia._pattern.creational.abstract_factory.product.Reader;
import com.fab.heroacademia._pattern.creational.abstract_factory.product.Writer;

public class MediaFactoryTest {
	
	private static final Logger logger = LoggerFactory.getLogger(MediaFactoryTest.class);
	
	private MediaFactory computerFactory;
	private MediaFactory bookFactory;
	
	@Test
	public void mediaFactoryTest() {
		computerFactory = new ComputerFactory();
		bookFactory = new BookFactory();
		
		Reader cReader = computerFactory.createReader();
		Reader bReader = bookFactory.createReader();
		Writer cWriter = computerFactory.createWriter();
		Writer bWriter = bookFactory.createWriter();
		
		
		logger.info(cReader.read());
		logger.info(bReader.read());
		
		cWriter.write("");
		bWriter.write("");
	}

}
