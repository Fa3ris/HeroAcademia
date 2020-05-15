package com.fab.heroacademia._pattern.behavioral.command.gui;

import lombok.Getter;

public class Editor {

	@Getter
	private String textField = "";
	
	public void addText(String s) {
		this.textField = this.textField.concat(s);
	}
	

}
