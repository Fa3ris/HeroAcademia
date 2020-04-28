package com.fab.java._abstract;

import com.fab.java._enum.Rank;
import com.fab.java._interface.Fight;
import com.fab.java._interface.Heal;
import com.fab.java._interface.Live;
import com.fab.java._interface.Move;
import com.fab.java.implementation.RegularFight;
import com.fab.java.implementation.RegularHeal;
import com.fab.java.implementation.RegularLive;
import com.fab.java.implementation.RegularMove;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public abstract class Person {

	// private static final Logger logger = LoggerFactory.getLogger(Person.class);

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

	
}
