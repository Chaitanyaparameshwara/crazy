package basicprogram;

import java.util.Scanner;

public class reverse {
	
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			int j=str.length()-1;
			int len=str.length();
			char ch[]=str.toCharArray();
			char var;
			for(int i=0;i<len/2;i++)
			{
				var=ch[i];
				ch[i]=ch[j];
				ch[j]=var;
				j--;
				
			}
			System.out.println(ch);
				
				
}

			
		

	}


