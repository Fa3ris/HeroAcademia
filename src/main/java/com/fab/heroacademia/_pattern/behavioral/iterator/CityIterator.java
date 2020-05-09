package com.fab.heroacademia._pattern.behavioral.iterator;

import com.fab.heroacademia._pattern.behavioral.iterator.collection.PointOfInterest;

public interface CityIterator {
	
	
	PointOfInterest getNext();
	boolean hasNext();

}
