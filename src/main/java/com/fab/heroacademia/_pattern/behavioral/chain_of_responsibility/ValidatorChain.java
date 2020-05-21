package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility;

import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceRequest;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceResponse;

public interface ValidatorChain {
	
	void validateNext(ResourceRequest req, ResourceResponse res);
	
}
