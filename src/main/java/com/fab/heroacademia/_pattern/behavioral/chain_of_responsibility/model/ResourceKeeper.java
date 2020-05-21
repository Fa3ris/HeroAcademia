package com.fab.heroacademia._pattern.behavioral.chain_of_responsibility.model;

import java.util.HashMap;
import java.util.Map;

public class ResourceKeeper {

	private Map<Integer, Resource> resources = new HashMap<Integer, Resource>();
	
	public ResourceKeeper() {
		
		Resource r1 = new Resource(new AuthorizationLevel(1, 1), 1, "Hello World");
		Resource r2 = new Resource(new AuthorizationLevel(2, 2), 2, "FOO");
		Resource r3 = new Resource(new AuthorizationLevel(3, 3), 3, "BAR");
		
		resources.put(r1.getId(), r1);
		resources.put(r2.getId(), r2);
		resources.put(r3.getId(), r3);
	}
	
	public Resource addResource(Resource r) {
		return resources.put(r.getId(), r);
	}
	
	public Resource getResource(Integer id) {
		return resources.get(id);
	}
	
	public AuthorizationLevel getAuthorizationLevelForResource(Integer id) {
		return resources.get(id).getAuthorizationLevel();
	}
}
