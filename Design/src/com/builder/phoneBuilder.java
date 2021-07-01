package com.builder;

public class phoneBuilder {
phone p;
	public int price;
	public String name;
	public String letter;
	public int id;
	public int getPrice() {
		return price;
	}
	public phoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public phoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public phoneBuilder setLetter(String letter) {
		this.letter = letter;
		return this;
	}

	public phoneBuilder setId(int id) {
		this.id = id;
		return this;
	}
	
	public phone getphone()
	{
		p=new phone(id, name,letter,price);
		return p;
	}
}
