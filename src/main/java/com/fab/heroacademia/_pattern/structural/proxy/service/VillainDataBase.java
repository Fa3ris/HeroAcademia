package com.fab.heroacademia._pattern.structural.proxy.service;

import java.util.List;

import com.fab.heroacademia._pattern.structural.proxy.Villain;

public interface VillainDataBase {
	
	List<Villain> getVillains();
	
	Villain getVillain(String name);

}
