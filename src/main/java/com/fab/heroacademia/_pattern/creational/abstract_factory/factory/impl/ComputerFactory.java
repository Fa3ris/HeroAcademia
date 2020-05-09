package com.fab.heroacademia._pattern.creational.abstract_factory.factory.impl;

import com.fab.heroacademia._pattern.creational.abstract_factory.factory.MediaFactory;
import com.fab.heroacademia._pattern.creational.abstract_factory.product.Reader;
import com.fab.heroacademia._pattern.creational.abstract_factory.product.Writer;
import com.fab.heroacademia._pattern.creational.abstract_factory.product.impl.ComputerReader;
import com.fab.heroacademia._pattern.creational.abstract_factory.product.impl.ComputerWriter;

public class ComputerFactory implements MediaFactory {

	@Override
	public Reader createReader() {
		return new ComputerReader();
	}

	@Override
	public Writer createWriter() {
		return new ComputerWriter();
	}

}
