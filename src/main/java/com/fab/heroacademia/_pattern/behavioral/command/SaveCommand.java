package com.fab.heroacademia._pattern.behavioral.command;

import com.fab.heroacademia._pattern.behavioral.command.gui.Editor;
import com.fab.heroacademia._pattern.behavioral.command.service.SaveService;

public class SaveCommand implements Command {
	
	private Editor editor;
	
	private SaveService saveService;
	
	public SaveCommand(Editor editor, SaveService saveService) {
		this.editor = editor;
		this.saveService = saveService;
	}

	@Override
	public void execute() {
		this.saveService.save(this.editor.getTextField());
	}

}
