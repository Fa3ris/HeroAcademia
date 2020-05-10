package com.fab.heroacademia._pattern.creational.builder;

public interface ComputerBuilder {
	
	void reset();
	void setRam(int ram);
	void setCPU(int cpu);
	void setGPU(int gpu);
	void setDisk(int disk);
	

}
