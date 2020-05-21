package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Resource {

	private AuthorizationLevel authorizationLevel;
	private int id;
	private String content;
}
