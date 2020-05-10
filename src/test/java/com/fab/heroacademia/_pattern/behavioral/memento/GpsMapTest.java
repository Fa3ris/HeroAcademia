package com.fab.heroacademia._pattern.behavioral.memento;

import org.junit.Test;

import com.fab.heroacademia._pattern.behavioral.strategy.memento.caretaker.GpsMap;
import com.fab.heroacademia._pattern.behavioral.strategy.memento.originator.GpsPosition;

public class GpsMapTest {

	
	
	@Test
	public void gpsMapTest() {
		GpsPosition position = new GpsPosition();
		GpsMap map = new GpsMap(position);
		
		map.changePosition(1, 1, 1);
		
		map.changePosition(2, 2, 2);
		
		map.undo();
		
		map.undo();
		
		
	}
}
