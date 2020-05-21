package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model;

import lombok.Data;

@Data
public class ResourceResponse {
	
	private boolean authenticated;
	private boolean granted;
	private Resource r;
	private String message;

}
