package com.project;

public abstract class Clothing extends Product {

	// man woman boy girl
	String genderClothing;

	public Clothing() {
		// TODO Auto-generated constructor stub
	}

	public Clothing(int id, int quantity, String name, String category, double price, String genderClothing,
			String typeofClothing) {
		super(id, quantity, name, category, price);
		this.genderClothing = genderClothing;
		this.typeofClothing = typeofClothing;
	}

	public String getGenderClothing() {
		return genderClothing;
	}

	public void setGenderClothing(String genderClothing) {
		this.genderClothing = genderClothing;
	}

	public String getTypeofClothing() {
		return typeofClothing;
	}

	public void setTypeofClothing(String typeofClothing) {
		this.typeofClothing = typeofClothing;
	}

	// shirt or pant
	String typeofClothing;

}
