package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator_chain;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.ValidatorChain;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.Resource;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceKeeper;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceRequest;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceResponse;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator.BaseValidator;

import lombok.Data;

@Data
public class ValidatorChainImpl implements ValidatorChain {

	private List<BaseValidator> validators = new ArrayList<BaseValidator>();
	
	private ListIterator<BaseValidator> it;
	
	private ResourceKeeper keeper;
	
	public ValidatorChainImpl(List<BaseValidator> validators, ResourceKeeper keeper) {
		this.keeper = keeper;
		addValidators(validators);
		initIterator();
	}
	
	private void addValidators(List<BaseValidator> validators) {
		this.validators = validators;
		this.validators.sort((BaseValidator v1, BaseValidator v2) -> v1.getOrder().compareTo(v2.getOrder()));
	}
	
	private void initIterator() {
		it = validators.listIterator();
	}
	
	@Override
	public void validateNext(ResourceRequest req, ResourceResponse res) {
		if (it.hasNext()) {
			it.next().validate(req, res, this);
		} else {
			Resource r = this.keeper.getResource(req.getTargetResourceId());
			res.setR(r);
			res.setMessage(r.getContent());
		}
	}

}
