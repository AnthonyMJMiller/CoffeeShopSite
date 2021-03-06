package com.CoffeeSiteProject.CoffeeShopSite.DAO;

public class Coffee {
	
	private String name;
	private String category;
	private String description;
	private double price;
	private int id;

	public Coffee() {
		
	}

	public Coffee(String name, String category, String description, double price, int id) {
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", category=" + category + ", description=" + description + ", price=" + price
				+ ", id=" + id + "]";
	}
	

}
