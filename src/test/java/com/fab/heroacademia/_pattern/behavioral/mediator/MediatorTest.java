package com.fab.heroacademia._pattern.behavioral.mediator;

import org.junit.Test;

import com.fab.heroacademia._pattern.behavioral.mediator.component.Consumer;
import com.fab.heroacademia._pattern.behavioral.mediator.component.Emitter;

public class MediatorTest {
	
	@Test
	public void testMediator() {
		Emitter e = new Emitter();
		Consumer c = new Consumer();
		MediatorImpl m = new MediatorImpl();
		
		e.setMediator(m);
		m.setConsumer(c);
		
		e.emit();
		e.emit();
		
	}

}
