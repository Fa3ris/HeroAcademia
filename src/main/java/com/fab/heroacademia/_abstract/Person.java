package com.fab.heroacademia._abstract;

import com.fab.heroacademia._enum.Rank;
import com.fab.heroacademia._interface.Fight;
import com.fab.heroacademia._interface.Heal;
import com.fab.heroacademia._interface.Live;
import com.fab.heroacademia._interface.Move;
import com.fab.heroacademia.implementation.RegularFight;
import com.fab.heroacademia.implementation.RegularHeal;
import com.fab.heroacademia.implementation.RegularLive;
import com.fab.heroacademia.implementation.RegularMove;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public abstract class Person {

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	protected Fight fight = new RegularFight();

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	protected Heal heal = new RegularHeal();

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	protected Move move = new RegularMove();

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	protected Live live = new RegularLive();
	
	@Setter(AccessLevel.NONE)
	protected Rank rank = Rank.E;
	
	protected Weapon weapon;

	public abstract void greet();

	public void eat() {
		live.eat();
	}
	
	public void drink() {
		live.drink();
	}
	
	public void sleep() {
		live.sleep();
	}

	public void punch() {
		fight.punch();
	}

	public void kick() {
		fight.kick();
	}

	public void heal() {
		heal.heal();
	}

	public void resurrect() {
		heal.resurrect();
	}

	public void walk() {
		move.walk();
	}

	public void jump() {
		move.jump();
	}

	public void fly() {
		move.fly();
	}
	
	public void useWeapon() {
		weapon.use();
	}

	
}
