package com.fab.heroacademia._pattern.behavioral.iterator;

import java.util.List;

import com.fab.heroacademia._pattern.behavioral.iterator.collection.Paris;
import com.fab.heroacademia._pattern.behavioral.iterator.collection.PointOfInterest;

public class ParisLevelIterator implements CityIterator {

	private Paris paris;
	private List<PointOfInterest> cache; 
	
	public ParisLevelIterator(Paris paris) {
		this.paris = paris;
	}
	
	@Override
	public PointOfInterest getNext() {
		return hasNext() ? cache.remove(0) : null;
	}

	@Override
	public boolean hasNext() {
		lazyInit();
		return cache.size() > 0;
	}
	
	private void lazyInit() {
		if (cache == null) {
			this.cache = paris.getPoi();
			this.sort();
		}
	}
	
	private void sort() {
		this.cache.sort((p1, p2) -> p2.getLevelInterest() - p1.getLevelInterest());
	}

}
