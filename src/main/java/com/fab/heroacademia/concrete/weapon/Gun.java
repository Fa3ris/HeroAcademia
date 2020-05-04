package com.fab.heroacademia.concrete.weapon;

import com.fab.heroacademia._abstract.Weapon;
import com.fab.heroacademia.implementation.Shoot;

public class Gun extends Weapon {
	
	public Gun() {
		super();
		this.weaponUse = new Shoot();
	}

}
