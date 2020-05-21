package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.AuthN;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.Credential;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceKeeper;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceRequest;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model.ResourceResponse;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator.AuthNValidator;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator.AuthZValidator;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator.BaseValidator;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator.UselessValidator;
import com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.validator_chain.ValidatorChainImpl;

public class ValidatorTest {

	private static final Logger logger = LoggerFactory.getLogger(ValidatorTest.class);
	
	@Test
	public void testAccess() {
		
		
		Credential c1 = new Credential(1, 1);
		Credential c2 = new Credential(2, 2);
		Credential c3 = new Credential(3, 3);
		
		AuthN auth1 = new AuthN(c1);
		AuthN auth2 = new AuthN(c2);
		AuthN auth3 = new AuthN(c3);
		
		List<AuthN> authList = new ArrayList<AuthN>(Arrays.asList(auth1, auth2, auth3));
		ResourceKeeper keeper = new ResourceKeeper();
		
		BaseValidator authN = new AuthNValidator();
		BaseValidator authZ = new AuthZValidator(keeper);
		
		
		List<BaseValidator> validators = new ArrayList<BaseValidator>(
				Arrays.asList(
						new UselessValidator(),
						authZ,
						new UselessValidator(),
						authN,
						new UselessValidator(),
						new UselessValidator()
						)
				);
		
		ValidatorChain chain;
		for (int i = 1; i < 4; i++) {
			
			for (AuthN auth : authList) {
				
				ResourceRequest req =  new ResourceRequest(i, auth);
				chain  = new ValidatorChainImpl(validators, keeper);
				ResourceResponse res = new ResourceResponse();
				chain.validateNext(req, res);
				
				logger.info("login: [{}] resourceId: [{}] message: [{}]", req.getAuthN().getCredential().getLogin(), req.getTargetResourceId(), res.getMessage());
			}
			 
		}
	}
}
