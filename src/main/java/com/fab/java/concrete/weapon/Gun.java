package com.fab.java.concrete.weapon;

import com.fab.java._abstract.Weapon;
import com.fab.java.implementation.Shoot;

public class Gun extends Weapon {
	
	public Gun() {
		super();
		this.weaponUse = new Shoot();
	}

}
