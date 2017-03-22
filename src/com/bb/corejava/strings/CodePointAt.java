package com.bb.corejava.strings;

public class CodePointAt {

	public static void main(String args[])
	{
		String str="Hello World!";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i)+" "+str.codePointAt(i));
		}
	}
}
