package com.bb.corejava.strings;

public class ToLowerCase {

	public static void main(String[] args) {
		String source1="I Love Google";
		
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
		
		/*char[] alphabetsUpper = {'A','B','C','D'};
		char[] alphabetsLower = {'a','b','c','d'};
		
		for(int i=0;i<alphabetsLower.length;i++)
		{
			System.out.println(alphabetsLower[i]+" -> "+alphabetsLower[i]);
		}
		
		for(int i=0;i<alphabetsUpper.length;i++)
		{
			System.out.println(alphabetsUpper[i]+" -> "+alphabetsUpper[i]);
		}*/
		

	}

}
