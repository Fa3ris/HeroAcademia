package com.fab.heroacademia._pattern.behavioral.iterator.collection;

import com.fab.heroacademia._pattern.behavioral.iterator.CityIterator;

public interface City {
	
	CityIterator getLevelIterator();
	CityIterator getNameIterator();
}
