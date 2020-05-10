package com.fab.heroacademia._pattern.creational.builder.director;

import com.fab.heroacademia._pattern.creational.builder.ComputerBuilder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ComputerDirector {
	
	private ComputerBuilder builder;
	
	public void makeCasualComputer() {
		this.builder.reset();
		this.builder.setCPU(2);
		this.builder.setDisk(1);
		this.builder.setGPU(0);
		this.builder.setRam(8);	
	}
	
	
	public void makeGamingComputer() {
		this.builder.reset();
		this.builder.setCPU(6);
		this.builder.setDisk(2);
		this.builder.setGPU(4);
		this.builder.setRam(32);
		
	}

}
