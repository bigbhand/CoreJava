package com.bb.corejava.strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Hello World!!";
		StringBuffer buff = new StringBuffer();
		
		int l=str.length();
		
		while((l-1)>=0)
		{
			buff.append(str.charAt(l-1));
			l--;
		}
		
		System.out.println(buff);

	}

}
