package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator;

import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.ValidatorChain;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.AuthN;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceRequest;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class AuthNValidator extends BaseValidator {

	
	public AuthNValidator() {
		this.order = 1;
	}
	
	@Override
	public void validate(ResourceRequest req, ResourceResponse res, ValidatorChain chain) {
		
		
		boolean authenticated = validateAuthN(req.getAuthN());
		res.setAuthenticated(authenticated);
		
		if (authenticated) {
			chain.validateNext(req, res);
		} else {
			res.setMessage("Invalid credentials");
		}		
	}
	
	
	private boolean validateAuthN(AuthN authN) {
		int login = authN.getCredential().getLogin(), password = authN.getCredential().getPassword();
		return (login == 1 && password == 1) 
				|| (login == 3 && password == 3);
	}
	

}
