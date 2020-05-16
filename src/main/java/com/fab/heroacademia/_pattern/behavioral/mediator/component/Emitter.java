package com.fab.heroacademia._pattern.behavioral.mediator.component;

public class Emitter extends Component {

	
	public void emit() {
		
		this.mediator.notify(this);
	}
}
