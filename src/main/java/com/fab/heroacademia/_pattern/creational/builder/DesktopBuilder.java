package com.fab.heroacademia._pattern.creational.builder;

import com.fab.heroacademia._pattern.creational.builder.product.Desktop;

public class DesktopBuilder implements ComputerBuilder {

	Desktop result;

	@Override
	public void reset() {
		result = new Desktop();

	}

	@Override
	public void setRam(int ram) {
		result.setRam(ram);

	}

	@Override
	public void setCPU(int cpu) {
		result.setCpu(cpu);
	}

	@Override
	public void setGPU(int gpu) {
		result.setGpu(gpu);
	}

	@Override
	public void setDisk(int disk) {
		result.setDisk(disk);
	}
	
	public Desktop build() {
		return result;
	}

}
