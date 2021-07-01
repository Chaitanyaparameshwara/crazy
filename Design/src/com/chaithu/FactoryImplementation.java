package com.chaithu;

public class FactoryImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		realFactory fact=new realFactory();
		//OS o=new windows();
		OS o=fact.givemetheobject("android");
		o.crazy();

	}

}
