package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator;

import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.Validator;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.ValidatorChain;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceRequest;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceResponse;

import lombok.Data;

@Data
public abstract class BaseValidator implements Validator {

	protected Integer order = 5;
	
	@Override
	public void validate(ResourceRequest req, ResourceResponse res, ValidatorChain chain) {
		chain.validateNext(req, res);		
	}
	
}
