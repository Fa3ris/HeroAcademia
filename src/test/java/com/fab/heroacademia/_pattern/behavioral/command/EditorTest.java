package com.fab.heroacademia._pattern.behavioral.command;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.command.gui.Editor;
import com.fab.heroacademia._pattern.behavioral.command.service.SaveService;

public class EditorTest {

	private static final Logger logger = LoggerFactory.getLogger(EditorTest.class);
	
	@Test
	public void testEditor() {
	
		Editor editor = new Editor();
		SaveService saveService = new SaveService();
		Command button = new SaveCommand(editor, saveService);
		
		editor.addText("Hello World");
		editor.addText(" my name is");
		editor.addText(" Fab.");
		
		button.execute();
		
		editor.addText(" And you?");
		editor.addText(" What is yours?");
		
		button.execute();
		
		for(String s : saveService.getSaveHistory()) {
			logger.info(s);
		}
		
		
	}
}
