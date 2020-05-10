package com.fab.heroacademia._pattern.behavioral.strategy.memento.originator;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class GpsPosition {
		
	private int x, y, z;
	
	public Memento snapshot() {
		return new Memento(this, x, y, z);
	}
	
	
	@AllArgsConstructor(access = AccessLevel.PRIVATE)
	public class Memento {
		
		private GpsPosition gps;
		private int x, y, z;
		
		
		public void restore() {
			gps.setX(x);
			gps.setY(y);
			gps.setZ(z);
		}
		
	}

}
