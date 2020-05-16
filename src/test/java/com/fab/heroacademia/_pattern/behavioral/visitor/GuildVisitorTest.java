package com.fab.heroacademia._pattern.behavioral.visitor;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fab.heroacademia._pattern.behavioral.visitor.guild.DarkGuild;
import com.fab.heroacademia._pattern.behavioral.visitor.guild.LightGuild;

public class GuildVisitorTest {

	private final static Logger logger = LoggerFactory.getLogger(GuildVisitorTest.class);
	@Test
	public void GuildTest() {
		GuildVisitor v = new GuildInspector();
		
		DarkGuild dg = new DarkGuild();
		LightGuild lg = new LightGuild();
		
		logger.info("before - dark guild reputation is : {}", dg.getReputation());
		
		logger.info("before - light guild reputation is : {}", lg.getReputation());
		
		v.visitDarkGuild(dg);
		v.visitLightGuild(lg);
		
		logger.info("after - dark guild reputation is : {}", dg.getReputation());
		logger.info("after - light guild reputation is : {}", lg.getReputation());
		
	}
}
