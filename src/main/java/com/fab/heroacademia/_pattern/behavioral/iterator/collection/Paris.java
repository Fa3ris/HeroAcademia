package com.fab.heroacademia._pattern.behavioral.iterator.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fab.heroacademia._pattern.behavioral.iterator.CityIterator;
import com.fab.heroacademia._pattern.behavioral.iterator.ParisLevelIterator;
import com.fab.heroacademia._pattern.behavioral.iterator.ParisNameIterator;

import lombok.Getter;

public class Paris implements City {
	
	@Getter
	private List<PointOfInterest> poi = new ArrayList<PointOfInterest>(
			
			Arrays.asList(
					new PointOfInterest("Tour Eiffel", 10),
					new PointOfInterest("Arc de Triomphe", 8),
					new PointOfInterest("Panthéon", 5)
					)
			
			
			); 

	@Override
	public CityIterator getLevelIterator() {
		return new ParisLevelIterator(this);
	}


	@Override
	public CityIterator getNameIterator() {
		return new ParisNameIterator(this);
	}

}
