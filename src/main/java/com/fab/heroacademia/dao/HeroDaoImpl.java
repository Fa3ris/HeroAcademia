package com.fab.heroacademia.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class HeroDaoImpl implements HeroDao {

	 private DataSource dataSource;
	 private JdbcTemplate jdbcTemplate;	
	 
	 
	 public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplate = new JdbcTemplate(dataSource);
	 }


	@Override
	public Integer getCount() {
		return jdbcTemplate.queryForObject(
			    "SELECT COUNT(*) FROM HERO", Integer.class);
	}
}
