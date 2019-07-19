package com.project;

import java.io.Serializable;

public class Shirt extends Clothing {

	String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Shirt() {
	}

	public Shirt(int id, int quantity, String name, String category, double price, String genderClothing,
			String typeofClothing, String size) {
		super(id, quantity, name, category, price, genderClothing, typeofClothing);
		this.size = size;
	}

	@Override
	public void buy() {

		System.out.println(this.getId() + "initial quantitiy " + this.getQuantity());
		System.out.println("SHIRT BOUGHT");
		setQuantity(this.getQuantity() - 1);
		System.out.println(this.getId() + "final quantitiy " + getQuantity());

	}

	@Override
	public void update(int updateQuantity) {
		System.out.println(this.getId() + " initial quantitiy " + this.getQuantity());
		setQuantity(this.getQuantity() + updateQuantity);
		System.out.println(this.getId() + " final quantitiy " + getQuantity());
	}

	@Override
	public void returnProduct() {
		// TODO Auto-generated method stub

		System.out.println(this.getId() + "initial quantitiy " + this.getQuantity());
		System.out.println("SHIRT RETURN");
		setQuantity(this.getQuantity() + 1);
		System.out.println(this.getId() + "final quantitiy " + getQuantity());

	}

	@Override
	public String toString() {
		return this.getId() + ")" + this.getName() + ",size=" + size + ", genderClothing=" + genderClothing
				+ ", typeofClothing=" + typeofClothing + ", price=" + price + "]";
	}

}
