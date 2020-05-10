package com.fab.heroacademia._pattern.creational.builder.product;

import lombok.Data;

@Data
public class Laptop {
	
	private final String type = "laptop";
	
	private int ram = 0;
	private int cpu = 0;
	private int gpu = 0;
	private int disk = 0;

}
