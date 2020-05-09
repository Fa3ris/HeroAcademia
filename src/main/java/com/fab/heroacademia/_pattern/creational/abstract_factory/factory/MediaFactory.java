package com.fab.heroacademia._pattern.creational.abstract_factory.factory;

import com.fab.heroacademia._pattern.creational.abstract_factory.product.Reader;
import com.fab.heroacademia._pattern.creational.abstract_factory.product.Writer;

public interface MediaFactory {
	
	Reader createReader();
	Writer createWriter();

}
