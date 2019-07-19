package com.project;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class Product implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private  int quantity;
	private String name;
	private String category;

	private Map<String, List<Product>>  map; 
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public Product(int id, int quantity, String name, String category, double price) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.category = category;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	double price;

	public abstract void buy();

	
	public abstract void returnProduct();

	public void update(int updateQuantity) {
		// TODO Auto-generated method stub
		
	}

}
