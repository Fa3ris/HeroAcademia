package com.fab.heroacademia.app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import com.fab.heroacademia._enum.Element;
import com.fab.heroacademia._enum.PersonType;
import com.fab.heroacademia._enum.WeaponType;
import com.fab.heroacademia._factory.PersonFactory;
import com.fab.heroacademia._factory.WeaponFactory;
import com.fab.heroacademia._generic.Magic;
import com.fab.heroacademia._runnable.ManaConsumer;
import com.fab.heroacademia._thread.SimpleThread;
import com.fab.heroacademia.concrete.person.Civilian;
import com.fab.heroacademia.concrete.person.Hero;
import com.fab.heroacademia.concrete.weapon.Sword;
import com.fab.heroacademia.model.ManaPool;

/**
 * Hello world!
 *
 */
public class App {

	
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Hello World!");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		
		for (String s : ctx.getBeanDefinitionNames()) {
			logger.info("container has bean named : " + s);
		}
		
		Hero h = ctx.getBean("hero", Hero.class);
		h.punch();
		h.greet();
		h.useWeapon();

		Civilian c = ctx.getBean("civilian", Civilian.class);
		
		c.useWeapon();
		
		c.greet();
		
		Hero h2 = ctx.getBean("hero2", Hero.class);
		logger.info(h2.getLastName());
		
		
		
//		_interface();
//		_stream();
//		_generic();
//		_enum();
//		 _thread();
//		_runnable();
//		_factory();
		
		
	}

	static private void _interface() {
		Civilian c = new Civilian();

		c.greet();
		c.eat();
		c.drink();
		c.sleep();
		c.punch();
		c.kick();
		c.walk();
		c.jump();
		c.fly();
		c.heal();
		c.resurrect();

		Hero h = new Hero(new Sword());
		h.greet();
		h.eat();
		h.drink();
		h.sleep();
		h.punch();
		h.kick();
		h.walk();
		h.jump();
		h.fly();
		h.heal();
		h.resurrect();
		h.kick();
	}

	static private void _stream() {
		/*
		 * STREAMS Faut pas trop lui en demander -> 10e9 iterations et il a plus de
		 * mémoire -_-
		 */

		List<Integer> l = IntStream.rangeClosed(0, 100).parallel().boxed().collect(Collectors.toList());
		Stream<Integer> s = l.parallelStream();
		List<Integer> res = s.filter(x -> x >= 50).collect(Collectors.toList());
		res.clear();
	}

	static private void _generic() {
		/* GENERICS */
		Magic<Element> m1 = new Magic<Element>();
		m1.summonMagic(Element.EARTH);
	}

	static private void _enum() {
		/* ENUMS */
		for (Element e : Element.values()) {
			String str = String.format("Element: %-10s Weakness: %-10s Strength: %-10s", e, e.getWeakness(),
					e.getStrength());

			logger.info(str);
		}
	}

	static private void _thread() {
		Thread alpha = new SimpleThread("ALPHA");
		Thread beta = new SimpleThread("BETA");

		alpha.start();
		beta.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		logger.info("{} au statut {}", alpha.getName(), alpha.getState());
		logger.info("{} au statut {}", beta.getName(), beta.getState());

	}

	static private void _runnable() {
		ManaPool mp = new ManaPool(50);

		Thread t1 = new Thread(new ManaConsumer(mp, "Zeta"));
		Thread t2 = new Thread(new ManaConsumer(mp, "Psy"));

		t1.start();
		t2.start();
	}

	static private void _factory() {
		PersonFactory pFactory = PersonFactory.getInstance();

		pFactory.create(PersonType.HERO);
		pFactory.create(PersonType.CIVILIAN);
		try {
			pFactory.create(PersonType.FIGHTER);
		} catch (IllegalArgumentException e) {
			logger.info("error creating Person : {}", e.getMessage());
		}

		WeaponFactory wFactory = WeaponFactory.getInstance();

		wFactory.create(WeaponType.GUN);
		wFactory.create(WeaponType.SWORD);
	}
}
