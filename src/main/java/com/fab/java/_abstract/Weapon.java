package com.fab.java._abstract;

import com.fab.java._interface.WeaponUse;
import com.fab.java.implementation.NoWeapon;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public abstract class Weapon {

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	protected WeaponUse weaponUse = new NoWeapon();
	
	void use() {
		this.weaponUse.use();
	}
}
