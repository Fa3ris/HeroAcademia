package com.fab.heroacademia._pattern.creational.abstract_factory.product.impl;

import com.fab.heroacademia._pattern.creational.abstract_factory.product.Reader;

public class BookReader implements Reader {

	@Override
	public String read() {
		return "ink text";

	}

}
