package com.fab.heroacademia._factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._abstract.Weapon;
import com.fab.heroacademia._enum.WeaponType;
import com.fab.heroacademia._interface.AbstractFactory;
import com.fab.heroacademia.concrete.weapon.Gun;
import com.fab.heroacademia.concrete.weapon.Sword;

public class WeaponFactory implements AbstractFactory<Weapon, WeaponType> {

	private static final Logger logger = LoggerFactory.getLogger(WeaponFactory.class);

	private WeaponFactory() {
	}

	private static WeaponFactory instance = new WeaponFactory();

	public static WeaponFactory getInstance() {
		return instance;
	}

	@Override
	public Weapon create(WeaponType type) throws IllegalArgumentException {
		switch (type) {
		case SWORD:
			logger.info("create Sword");
			return new Sword();

		case GUN:
			logger.info("create Gun");
			return new Gun();
		default:
			throw new IllegalArgumentException(type + " not supported");
		}
	}

}
