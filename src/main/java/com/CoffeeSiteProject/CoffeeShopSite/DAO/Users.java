package com.CoffeeSiteProject.CoffeeShopSite.DAO;

public class Users {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNo;
	private int id;
	
	public Users() {
		
	}

	public Users(String firstName, String lastName, String email, String password, String phoneNo, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Users [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", phoneNo=" + phoneNo + ", id=" + id + "]";
	}

}
