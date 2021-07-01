package com.builder;

public class phone {

	
	public int price;
	public String name;
	public String letter;
	public int id;
	public phone(int price, String name, String letter, int id) {
		super();
		this.price = price;
		this.name = name;
		this.letter = letter;
		this.id = id;
	}
	@Override
	public String toString() {
		return "phone [price=" + price + ", name=" + name + ", letter=" + letter + ", id=" + id + "]";
	}
	
	
}
