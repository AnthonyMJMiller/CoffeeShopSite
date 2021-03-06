package com.CoffeeSiteProject.CoffeeShopSite.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsersJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int addPerson(String fname, String lname, String email, String phone, String password) {
		String addQuery = "insert into users(firstName, LastName, Email, PhoneNo, Password) values(?,?,?,?,?)";
		return jdbcTemplate.update(addQuery, fname, lname, email, phone, password);
	}

}
