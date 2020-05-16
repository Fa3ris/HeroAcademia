package com.fab.heroacademia._pattern.structural.composite.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fab.heroacademia._pattern.structural.composite.Reducer;

public class AbstractComposite implements Reducer {

	protected List<Reducer> children = new ArrayList<Reducer>();

	public void addChildren(Collection<? extends Reducer> r) {
		this.children.addAll(r);
	}

	@Override
	public int count() {
		int res = 0;
		for (Reducer r : children) {
			res += r.count();
		}
		return res;

	}
}
