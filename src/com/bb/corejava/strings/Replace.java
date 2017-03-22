package com.bb.corejava.strings;

import java.util.StringTokenizer;

public class Replace {
	
	public static void main(String[] arg)
	{
		/*source1.replace(oldChar, newChar);
		source1.replace(target, replacement);
		source1.replaceAll(regex, replacement);
		source1.replaceFirst(regex, replacement);*/
		
		String source1="I Love Google";
		
		//replace o -> *
		StringBuilder replaceChar=new StringBuilder();
		for(int i=0;i<source1.length();i++)
		{
			if(source1.charAt(i)=='o'|| source1.charAt(i)=='O')
			{
				replaceChar.append('*');
			}
			else
			{
				replaceChar.append(source1.charAt(i));
			}
		}
		System.out.println("\nreplaceCharacter");
		System.out.println("Inbuilt : "+source1.replace('o', '*'));
		System.out.println("Custom  : "+replaceChar);
		
		//replace Google ->Intel
		
		StringBuilder replaceWord=new StringBuilder();
		String delemeter=" ";
		StringTokenizer strToken = new StringTokenizer(source1,delemeter);
		while(strToken.hasMoreTokens())
		{
			String token=strToken.nextToken();
			if(token.equalsIgnoreCase("Google"))
			{
				replaceWord.append("Intel"+delemeter);
			}
			else
			{
				replaceWord.append(token+delemeter);
			}
		}
		System.out.println("\nreplaceWord");
		System.out.println("Inbuilt : "+source1.replace("Google", "Intel"));
		System.out.println("Custom  : "+replaceWord);
		
		//replace pattern
		String text="it suffices to wonder 73 at these secretes 00 at every moment";
		System.out.println(text.replace("at", "THE"));
		System.out.println(text.replaceAll("[0-9]", "*"));
		System.out.println(text.replaceFirst("at", "THE"));
		
		
	}
}
