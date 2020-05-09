package com.fab.heroacademia._pattern.structural.proxy;

import org.junit.Test;

import com.fab.heroacademia._pattern.structural.proxy.service.VillainDataBase;
import com.fab.heroacademia._pattern.structural.proxy.service.VillainDataBaseImpl;

public class VillainDataBaseProxyTest {
	
	private VillainDataBase proxy;
	private VillainDataBase service;
	
		
	@Test
	public void proxyTest() {
		service = new VillainDataBaseImpl();
		proxy = new VillainDataBaseProxy(service);
		
		proxy.getVillains();
		
		proxy.getVillains();
		
		proxy.getVillain("Madara");
		proxy.getVillain("Hisoka");
		proxy.getVillain("Hisoka");
		
		proxy.getVillain("Meruem");
	}
	
	

}
