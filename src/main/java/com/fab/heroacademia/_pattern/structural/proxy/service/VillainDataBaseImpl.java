package com.fab.heroacademia._pattern.structural.proxy.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.proxy.Villain;

public class VillainDataBaseImpl implements VillainDataBase{
	
	private static final Logger logger = LoggerFactory.getLogger(VillainDataBaseImpl.class);
	
	List<Villain> villains = new ArrayList<Villain>(
			Arrays.asList(
					new Villain("Madara", 500),
					new Villain("Aizen", 1000),
					new Villain("Hisoka", 300)
		
			));
			

	@Override
	public List<Villain> getVillains() {
		logger.info("real getVillains called");
		Long t1 = System.currentTimeMillis();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Long elapsed = System.currentTimeMillis() - t1;
		logger.info("real getVillains finished after {} ms", elapsed);
		return villains;
	}

	@Override
	public Villain getVillain(String name) {
		
		logger.info("real getVillain called for name {}", name);
		Long t1 = System.currentTimeMillis();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (Villain v : villains) {
			if (v.getName().equalsIgnoreCase(name)) {
				Long elapsed = System.currentTimeMillis() - t1;
				logger.info("real getVillain found for name {} after {} ms", name, elapsed);
			return v;
		}
	}

		Long elapsed = System.currentTimeMillis() - t1;
		logger.error("real getVillain not found for name {} after {} ms", name, elapsed);
		return null;
	}
}
