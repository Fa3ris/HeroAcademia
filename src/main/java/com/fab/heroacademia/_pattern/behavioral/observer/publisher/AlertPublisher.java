package com.fab.heroacademia._pattern.behavioral.observer.publisher;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.observer.subscriber.AlertSubscriber;

public class AlertPublisher {
	
	private static final Logger logger = LoggerFactory.getLogger(AlertPublisher.class);
	
	private Map<AlertLevel, Set<AlertSubscriber>> subscribers;
	
	public AlertPublisher() {
		initSubscribers();
	}
	
	
	private void initSubscribers() {
		subscribers = new HashMap<AlertLevel, Set<AlertSubscriber>>();
		
		for (AlertLevel level : AlertLevel.values()) { 
			subscribers.put(level, new HashSet<AlertSubscriber>());
			
		}
	}
	
	public boolean subscribe(AlertLevel level, AlertSubscriber subscriber) {
		boolean res = subscribers.get(level).add(subscriber);
		if (res) {
			logger.info("add subscriber {} for level {}", subscriber, level);
		} else {
			logger.error("subscriber {} already present for level {}", subscriber, level);
		}
		
		return res;
	}
	
	public boolean unsubscribe(AlertLevel level, AlertSubscriber subscriber) {
		
		boolean res = subscribers.get(level).remove(subscriber);
		
		if (res) {
			logger.info("remove subscriber {} for level {}", subscriber, level);
		} else {
			logger.error("subscriber {} not present for level {}", subscriber, level);
		}
		return res;
	}
	
	public int notify(AlertLevel level) {
		int count = 0;
		
		for (AlertLevel alertLevel : AlertLevel.values()) {
			if (alertLevel.compareTo(level) >= 0) {
				count += subscribers.get(alertLevel).size();
				for(AlertSubscriber subscriber : subscribers.get(alertLevel)) {				
					
					subscriber.update(level);
				}
				
			}
		}
		
		
		
		return count;
	}

}
