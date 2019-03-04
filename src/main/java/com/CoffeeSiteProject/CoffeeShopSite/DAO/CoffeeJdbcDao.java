package com.CoffeeSiteProject.CoffeeShopSite.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Coffee> findAllCoffee() {
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Coffee>(Coffee.class));
	}

}
