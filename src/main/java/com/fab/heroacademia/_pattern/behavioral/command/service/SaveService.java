package com.fab.heroacademia._pattern.behavioral.command.service;

import java.util.ArrayDeque;
import java.util.Deque;

import lombok.Getter;

public class SaveService {

	@Getter
	private Deque<String> saveHistory = new ArrayDeque<String>();
	
	
	public void save(String s) {
		this.saveHistory.push(s);
	}
	
	
}
