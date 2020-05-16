package com.fab.heroacademia._pattern.behavioral.visitor;

import com.fab.heroacademia._pattern.behavioral.visitor.guild.DarkGuild;
import com.fab.heroacademia._pattern.behavioral.visitor.guild.LightGuild;

public interface GuildVisitor {
	
	void visitLightGuild(LightGuild g);
	void visitDarkGuild(DarkGuild g);

}
