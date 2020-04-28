package com.fab.java._enum;

public enum Element {
	FIRE("WIND", "WATER"),
	WATER("FIRE", "EARTH"),
	EARTH("WATER", "WIND"),
	WIND("EARTH", "FIRE"),
	
	ALMIGHTY(),
	NONE();
	
	private String strength;
	private String weakness;
	
	Element() {
	}
	
	Element(String str, String weak) {
		this.strength = str;
		this.weakness = weak;
	}
	
	public Element getStrength() {
		return strength != null ? Element.valueOf(strength) : Element.NONE;
	
	}
	
	public Element getWeakness() {
		return weakness != null ? Element.valueOf(weakness) : Element.NONE;
	}
}
