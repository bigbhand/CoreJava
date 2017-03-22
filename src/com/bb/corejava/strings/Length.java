package com.bb.corejava.strings;

public class Length {

	public static void main(String[] args) {
		
		String str="Hello World!!";
		System.out.println("Inbuilt : "+str.length());
		int i=0;
		try
		{
			while(str.charAt(i)>=0)
			{
				i++;
			}
		}catch(Exception e)
		{
			System.out.println();
		}
		System.out.println("Custom  : "+i);

	}

}
