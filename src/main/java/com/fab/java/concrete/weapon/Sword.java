package com.fab.java.concrete.weapon;

import com.fab.java._abstract.Weapon;
import com.fab.java.implementation.Slash;

public class Sword extends Weapon {
	
	public Sword() {
		super();
		this.weaponUse = new Slash();
	}

}
