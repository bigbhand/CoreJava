package com.bb.corejava.collections;

import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {


		String source1="I Love \n Google";
		String source2=new String("I Love Google");
		//source2.
		
		//toUpperCase
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
		System.out.println("\ntoUpperCase");
		System.out.println("Inbuilt :"+ source1.toUpperCase());
		System.out.println("Custom  :"+upperCase.toString());
		
		//toLowerCase
		StringBuilder lowerCase=new StringBuilder();
		for(int i=0;i<source1.length();i++)
		{
			if(source1.charAt(i)>'A'&&source1.charAt(i)<'Z')
			{
				lowerCase.append((char)(source1.charAt(i)+32));
			}
			else
			{
				lowerCase.append(source1.charAt(i));
			}
		}
		System.out.println("\ntoLowerCase");
		System.out.println("Inbuilt :"+source1.toLowerCase());
		System.out.println("Custom  :"+lowerCase.toString());
				
		//replace
		/*source1.replace(oldChar, newChar);
		source1.replace(target, replacement);
		source1.replaceAll(regex, replacement);
		source1.replaceFirst(regex, replacement);*/
		//replace o -> l
		StringBuilder replaceChar=new StringBuilder();
		for(int i=0;i<source1.length();i++)
		{
			if(source1.charAt(i)=='o'|| source1.charAt(i)=='O')
			{
				replaceChar.append('l');
			}
			else
			{
				replaceChar.append(source1.charAt(i));
			}
		}
		System.out.println("\nreplaceCharacter");
		System.out.println("Inbuilt : "+source1.replace('o', 'l'));
		System.out.println("Custom  : "+replaceChar);
		
		//replace Google ->Intel
		System.out.println(source1.replace("Google", "Intel"));
		StringTokenizer strToken = new StringTokenizer(source1," ");
		while(strToken.hasMoreTokens())
		{
			System.out.println(strToken.nextToken());
		}
		
	}

}
