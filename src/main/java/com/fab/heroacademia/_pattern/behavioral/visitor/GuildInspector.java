package com.fab.heroacademia._pattern.behavioral.visitor;

import com.fab.heroacademia._pattern.behavioral.visitor.guild.DarkGuild;
import com.fab.heroacademia._pattern.behavioral.visitor.guild.LightGuild;

public class GuildInspector implements GuildVisitor {

	@Override
	public void visitLightGuild(LightGuild g) {
		g.setReputation(g.getReputation() + 10);

	}

	@Override
	public void visitDarkGuild(DarkGuild g) {
		g.setReputation(g.getReputation() - 10);
	}

}
