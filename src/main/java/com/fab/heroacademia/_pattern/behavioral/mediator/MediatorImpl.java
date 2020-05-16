package com.fab.heroacademia._pattern.behavioral.mediator;

import com.fab.heroacademia._pattern.behavioral.mediator.component.Component;
import com.fab.heroacademia._pattern.behavioral.mediator.component.Consumer;
import com.fab.heroacademia._pattern.behavioral.mediator.component.Emitter;

import lombok.Setter;

public class MediatorImpl implements Mediator {
	
	@Setter
	private Consumer consumer;
	
	
	@Override
	public void notify(Component c) {
		
		
		if (c instanceof Emitter) {
			consumer.react();
		}
		
	}

}
