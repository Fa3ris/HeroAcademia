package com.fab.heroacademia._pattern.creational.prototype;

import lombok.ToString;

@ToString
public class Ninja implements NinjaPrototype {

	private String name;
	private int rank;
	
	public Ninja(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	
	public Ninja(Ninja proto) {
		this.name = proto.name;
		this.rank = proto.rank;
	}
	
	@Override
	public NinjaPrototype copy() {
		return new Ninja(this);
	}
	
	

}
