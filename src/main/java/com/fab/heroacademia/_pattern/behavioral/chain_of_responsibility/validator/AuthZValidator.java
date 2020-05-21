package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator;

import java.util.HashMap;
import java.util.Map;

import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.ValidatorChain;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.AuthorizationLevel;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceKeeper;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceRequest;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class AuthZValidator extends BaseValidator {

	private ResourceKeeper keeper;
	
	private Map<Integer, AuthorizationLevel> usersDB = new HashMap<Integer, AuthorizationLevel>();
	
	public AuthZValidator(ResourceKeeper keeper) {
		this.order = 10;
		this.keeper = keeper;
		usersDB.put(1, new AuthorizationLevel(1, 1));
		usersDB.put(2, new AuthorizationLevel(2, 2));
		usersDB.put(3, new AuthorizationLevel(3, 3));
	}
	
	@Override
	public void validate(ResourceRequest req, ResourceResponse res, ValidatorChain chain) {
				
		boolean granted = canAccess(
				getAuthorizationLevelFromLogin(req.getAuthN().getCredential().getLogin()),
				getAuthorizationLevelFromResouce(req.getTargetResourceId()));
		res.setGranted(granted);
		
		if (granted) {
			chain.validateNext(req, res);
		} else {
			res.setMessage("Unauthorized");
		}		
	}
	
	
	private boolean canAccess(AuthorizationLevel candidateLevel, AuthorizationLevel resourceLevel) {
		return candidateLevel.getGroup() >= resourceLevel.getGroup()
				&& candidateLevel.getRole() >= resourceLevel.getRole();
	}
	
	
	private AuthorizationLevel getAuthorizationLevelFromLogin(Integer login) {
		return usersDB.get(login);
	}
	
	private AuthorizationLevel getAuthorizationLevelFromResouce(Integer id) {
		return keeper.getAuthorizationLevelForResource(id);
	}
}
