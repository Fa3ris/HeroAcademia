package com.fab.heroacademia._pattern.structural.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.proxy.service.VillainDataBase;

public class VillainDataBaseProxy implements VillainDataBase {
	
	private static final Logger logger = LoggerFactory.getLogger(VillainDataBaseProxy.class);

	private List<Villain> cachedVillainList;

	private Map<String, Villain> cachedVillainMap = new HashMap<String, Villain>();

	private VillainDataBase service;

	public VillainDataBaseProxy(VillainDataBase service) {
		this.service = service;
	}

	@Override
	public List<Villain> getVillains() {
		Long t1 = System.currentTimeMillis();
		if (cachedVillainList == null) {
			logger.info("calling real getVillains");
			cachedVillainList = service.getVillains();
		} else {
			logger.info("getVillains - use cached value");
		}
		
		Long elapsed = System.currentTimeMillis() - t1;
		logger.info("proxy getVillains finished after {} ms", elapsed);
		return cachedVillainList;
	}

	@Override
	public Villain getVillain(String name) {
		Long t1 = System.currentTimeMillis();
		Villain v = cachedVillainMap.get(name);

		if (v == null) {
			logger.info("calling real getVillain for name {}", name);
			Villain res = service.getVillain(name);
			if (res != null) {
				v = res;
				cachedVillainMap.put(name, res);
			}
		} else {
			logger.info("getVillain for name {} - use cached value", name);
			
		}
		Long elapsed = System.currentTimeMillis() - t1;
		logger.info("proxy getVillain for name {} finished after {} ms", name, elapsed);
		return v;
	}

}
