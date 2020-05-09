package com.fab.heroacademia._pattern.structural.bridge.abstraction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.structural.bridge.implementation.Transport;

public class ControlPanel {

	private static final Logger logger = LoggerFactory.getLogger(ControlPanel.class);

	private Transport t;

	public ControlPanel(Transport t) {
		this.t = t;
	}

	public void togglePower() {
		if (t.isStarted()) {
			logger.info("toggle off");
			t.stop();
		} else {
			if (t.canStart()) {
				logger.info("toggle on");
				t.start();
			} else {
				logger.error("cannot start");
			}
		}
	}

	public void advance() {
		if (t.isStarted()) {
			if (t.canMove()) {
				t.move();
			} else {
				logger.error("cannot advance");
			}
		} else {
			logger.error("need to toggle power");
		}
	}

}
