package com.fab.heroacademia._pattern.creational.abstract_factory.product.impl;

import com.fab.heroacademia._pattern.creational.abstract_factory.product.Reader;

public class ComputerReader implements Reader {

	@Override
	public String read() {
		return "byte text";

	}

}
