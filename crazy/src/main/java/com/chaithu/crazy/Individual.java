package com.chaithu.crazy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Individual {

	
	public int id;
	public String name;
	public int number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Individual [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
	
}
