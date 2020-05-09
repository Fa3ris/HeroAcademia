package com.fab.heroacademia._pattern.behavioral.observer;

import org.junit.Before;
import org.junit.Test;

import com.fab.heroacademia._pattern.behavioral.observer.publisher.AlertLevel;
import com.fab.heroacademia._pattern.behavioral.observer.publisher.AlertPublisher;
import com.fab.heroacademia._pattern.behavioral.observer.publisher.AlertSystem;
import com.fab.heroacademia._pattern.behavioral.observer.subscriber.AlertSubscriber;
import com.fab.heroacademia._pattern.behavioral.observer.subscriber.HeroicSubscriber;
import com.fab.heroacademia._pattern.behavioral.observer.subscriber.JournalistSubscriber;

public class AlertSystemTest {
	
	private AlertSystem system;
	private AlertPublisher publisher;
	
	private AlertSubscriber journalist;
	private AlertSubscriber wolfHero;
	private AlertSubscriber tigerHero;
	private AlertSubscriber demonHero;
	private AlertSubscriber dragonHero;
	private AlertSubscriber godHero;
	
	
	@Before
	public void setup() {
		
		publisher = new AlertPublisher();
		system = new AlertSystem(publisher);
		
		journalist = new JournalistSubscriber();
		wolfHero = new HeroicSubscriber("wolf");
		tigerHero = new HeroicSubscriber("tiger");
		demonHero = new HeroicSubscriber("demon");
		dragonHero = new HeroicSubscriber("dragon");
		godHero = new HeroicSubscriber("god");
		
		publisher.subscribe(AlertLevel.GOD, journalist);
		publisher.subscribe(AlertLevel.WOLF, wolfHero);
		publisher.subscribe(AlertLevel.TIGER, tigerHero);
		publisher.subscribe(AlertLevel.DEMON, demonHero);
		publisher.subscribe(AlertLevel.DRAGON, dragonHero);
		publisher.subscribe(AlertLevel.GOD, godHero);
	}
	
	@Test
	public void testSubscription() {
		
		system.createAlert(AlertLevel.WOLF);
		system.createAlert(AlertLevel.TIGER);
		system.createAlert(AlertLevel.DEMON);
		system.createAlert(AlertLevel.DRAGON);
		system.createAlert(AlertLevel.GOD);
		
	}

}
