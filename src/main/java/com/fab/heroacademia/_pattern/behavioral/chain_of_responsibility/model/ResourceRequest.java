package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResourceRequest {

	private int targetResourceId;
	private AuthN authN;
}
