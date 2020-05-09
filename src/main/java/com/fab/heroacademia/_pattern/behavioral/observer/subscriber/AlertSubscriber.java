package com.fab.heroacademia._pattern.behavioral.observer.subscriber;

import com.fab.heroacademia._pattern.behavioral.observer.publisher.AlertLevel;

public interface AlertSubscriber {
	
	void update(AlertLevel level);

}
