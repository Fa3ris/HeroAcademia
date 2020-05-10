package com.fab.heroacademia._pattern.creational.builder.product;

import lombok.Data;

@Data
public class Desktop {
	
	private final String type = "desktop";
	
	private int ram = 0;
	private int cpu = 0;
	private int gpu = 0;
	private int disk = 0;

}
