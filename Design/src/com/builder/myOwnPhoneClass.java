package com.builder;

public class myOwnPhoneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		phone p=new phone(89,"classy","c",1);
		
		phone ph=new phoneBuilder().setId(89).setPrice(9694).setName("android").setLetter("pc").getphone();
		System.out.println(ph);
		
	}

}
