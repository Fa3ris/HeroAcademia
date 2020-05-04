package com.fab.heroacademia.model;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._thread.SimpleThread;

import lombok.AccessLevel;

@Data
@RequiredArgsConstructor
public class ManaPool {
	
	private static final Logger logger = LoggerFactory.getLogger(ManaPool.class);
	
	@Setter(AccessLevel.NONE)
	@Getter(AccessLevel.NONE)
	@NonNull
	private Integer amount;
	
	/**
	 * Diminue le ManaPool de la quantité spécifié.
	 * La quantité doit être positive
	 * S'il y a assez de réserve, retire la valeur demandée et renvoie la quantité restante.
	 * Si pas assez de réserve, renvoie -1
	 * @param amount
	 * @return la quantité restante, -1 sinon
	 */
	public synchronized int useMana(int amount, String consumer) {
		
		if(amount < 0) {
			logger.info("{} is negative value", amount);
			return this.amount;
		}
		
		if (canDecreaseMana(amount, consumer)) {
			this.amount -= amount;
			logger.info("{} pool decreased by {} - total is {}", consumer,  amount, this.amount);
			return this.amount;
			
		} else {
			logger.info("{} not enough mana to consume {} - total is {}", consumer, amount, this.amount);
			return -1;
		}
	}
	
	private boolean canDecreaseMana(int amount, String consumer) {
		logger.info("{} {} - {} = {} - {}", consumer, this.amount, amount, this.amount - amount, (this.amount - amount)  >= 0);
		return (this.amount - amount)  >= 0;
	}

}
