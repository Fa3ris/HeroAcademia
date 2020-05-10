package com.fab.heroacademia._pattern.creational.builder;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.creational.builder.director.ComputerDirector;

public class ComputerBuilderTest {

	private static final Logger logger = LoggerFactory.getLogger(ComputerBuilderTest.class);
	
	
	
	@Test
	public void buildLaptopCasualTest() {
		
		LaptopBuilder builder;
		ComputerDirector director;
		
		builder = new LaptopBuilder();
		director = new ComputerDirector(builder);
		
		director.makeCasualComputer();
		logger.info(builder.build().toString());
		
	}
	
	@Test
	public void buildLaptopGamingTest() {
		
		LaptopBuilder builder;
		ComputerDirector director;
		
		builder = new LaptopBuilder();
		director = new ComputerDirector(builder);
		
		director.makeGamingComputer();
		logger.info(builder.build().toString());
		
	}
	
	@Test
	public void buildDesktopCasualTest() {
		
		DesktopBuilder builder;
		ComputerDirector director;
		
		builder = new DesktopBuilder();
		director = new ComputerDirector(builder);
		
		director.makeCasualComputer();
		logger.info(builder.build().toString());
		
	}
	
	@Test
	public void buildDesktopGamingTest() {
		
		DesktopBuilder builder;
		ComputerDirector director;
		
		builder = new DesktopBuilder();
		director = new ComputerDirector(builder);
		
		director.makeGamingComputer();
		logger.info(builder.build().toString());
		
	}
}
