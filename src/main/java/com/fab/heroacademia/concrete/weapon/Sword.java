package com.fab.heroacademia.concrete.weapon;

import com.fab.heroacademia._abstract.Weapon;
import com.fab.heroacademia.implementation.Slash;

public class Sword extends Weapon {
	
	public Sword() {
		super();
		this.weaponUse = new Slash();
	}

}
