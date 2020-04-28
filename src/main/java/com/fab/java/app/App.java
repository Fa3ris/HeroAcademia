package com.fab.java.app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.java._enum.Element;
import com.fab.java._generics.Magic;
import com.fab.java._runnable.ManaConsumer;
import com.fab.java._thread.SimpleThread;
import com.fab.java.concrete.Civilian;
import com.fab.java.concrete.Hero;
import com.fab.java.model.ManaPool;

/**
 * Hello world!
 *
 */
public class App {

	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Hello World!");

//		_interface();
//		_stream();
//		_generic();
//		_enum();
//		 _thread();
		_runnable();
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

		Hero h = new Hero();
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
}
