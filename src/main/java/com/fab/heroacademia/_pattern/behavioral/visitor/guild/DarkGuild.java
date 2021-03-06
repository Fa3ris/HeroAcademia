package com.fab.heroacademia._pattern.behavioral.visitor.guild;

import com.fab.heroacademia._pattern.behavioral.visitor.GuildVisitor;

import lombok.Getter;
import lombok.Setter;

public class DarkGuild implements Guild {

	@Getter
	@Setter
	private int reputation = 100;
	
	@Override
	public void accept(GuildVisitor v) {
		v.visitDarkGuild(this);

	}

}
