package com.fab.heroacademia._pattern.behavioral.visitor.guild;

import com.fab.heroacademia._pattern.behavioral.visitor.GuildVisitor;

public interface Guild {
	
	void accept(GuildVisitor v);
}
