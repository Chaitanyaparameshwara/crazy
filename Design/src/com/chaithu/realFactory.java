package com.chaithu;

public class realFactory {

	public OS givemetheobject(String str)
	{
		if(str.equals("android"))
		{
			return new android();
		}
		else if(str.equals("IOS"))
		{
			return new IOS();
		}
		else
		{
			return new windows();
		}
	}
	
}
