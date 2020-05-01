package com.fab.java._interface;

public interface AbstractFactory <T, E extends Enum<E>> {
	
	T create(E e);
	
}
