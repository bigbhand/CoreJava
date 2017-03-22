package com.bb.corejava.strings;

public class CompareTo {

	public static void main(String[] arg)
	{
		String str1="helood";
		String str2="helooda";
		
		int result=0;
		
		System.out.println("Inbuilt Difference : "+str1.compareTo(str2));
		
		int length=str1.length()<str2.length()?str1.length():str2.length();
		
		for(int i=0;i<length;i++)
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
			   result=0;
			}
			else
			{
			   result=str1.charAt(i)-str2.charAt(i);break;
			}
		}
		
		if(result==0)
		{
			result=str1.length()-str2.length();
		}
		
		System.out.println("Inbuilt Difference : "+result);
	}
}
