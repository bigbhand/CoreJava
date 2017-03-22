package com.bb.corejava.strings;

public class ToUpperCase {

	public static void main(String[] arg) {
		String source1="I Love Google";
		
		StringBuilder upperCase=new StringBuilder();
		
		for(int i=0;i<source1.length();i++)
		{
			if(source1.charAt(i)>'a'&&source1.charAt(i)<'z')
			{
				upperCase.append((char)(source1.charAt(i)-32));
			}
			else
			{
				upperCase.append(source1.charAt(i));
			}
		}
		
		System.out.println("toUpperCase()");
		System.out.println("Inbuilt :"+ source1.toUpperCase());
		System.out.println("Custom  :"+upperCase.toString());
		
	}
}
