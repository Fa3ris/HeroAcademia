package com.fab.java._runnable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.java.model.ManaPool;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ManaConsumer implements Runnable {

	private static final Logger logger = LoggerFactory.getLogger(ManaConsumer.class);

	@NonNull
	ManaPool mp;
	@NonNull
	String name;

	@Override
	public void run() {
		int amountLeft;
		int toConsume = 10;
		do {
			amountLeft = this.mp.useMana(toConsume, this.name);
			if (amountLeft > -1) {
				logger.info("{} mana left after consumption by {}", amountLeft, this.name);
			}

		} while (amountLeft > 0);
		logger.info("{} stopped consumption", this.name);
	}

}
