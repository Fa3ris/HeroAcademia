package com.fab.heroacademia._pattern.behavioral.command.gui;

import com.fab.heroacademia._pattern.behavioral.command.Command;

public class Button {
	
	
	Command cmd;

	public Button(Command cmd) {
		this.cmd = cmd;
	}
	
	public void execute() {
		this.cmd.execute();
	}
}
