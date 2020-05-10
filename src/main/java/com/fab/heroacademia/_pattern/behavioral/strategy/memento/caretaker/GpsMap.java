package com.fab.heroacademia._pattern.behavioral.strategy.memento.caretaker;

import java.util.ArrayDeque;
import java.util.Deque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.strategy.memento.originator.GpsPosition;
import com.fab.heroacademia._pattern.behavioral.strategy.memento.originator.GpsPosition.Memento;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GpsMap {
	
	private static final Logger logger = LoggerFactory.getLogger(GpsMap.class);
	
	private Deque<Memento> stack = new ArrayDeque<Memento>();
	
	@NonNull private GpsPosition position;
	
	
	public void changePosition(int x, int y, int z) {
		this.backup();
		position.setX(x);
		position.setY(y);
		position.setZ(z);
		logger.info("change position {}", position.toString());
	}
	
	public void backup() {
		stack.push(position.snapshot());
	}
	
	public void undo() {
		stack.pop().restore();
		logger.info("revert position {}", position.toString());
	}
}
