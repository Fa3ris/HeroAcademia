package com.fab.heroacademia._pattern.creational.prototype;

import lombok.ToString;

@ToString(callSuper=true)
public class KonohaNinja extends Ninja {

	private String clan;
	
	public KonohaNinja(String name, int rank, String clan) {
		super(name, rank);
		this.clan = clan;
	}
	
	
	public KonohaNinja(KonohaNinja proto) {
		super(proto);
		this.clan = proto.clan;
	}
	
	@Override
	public NinjaPrototype copy() {
		return new KonohaNinja(this);
	}

}
