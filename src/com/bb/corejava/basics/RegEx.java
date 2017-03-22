package com.bb.corejava.basics;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		String input="1abcd120^ja";
		String pattern="\\d";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		
		while(m.find())
		{
			System.out.println(m.start());
			System.out.println(m.end());
		}
		//Integer d=1;
		
		//test(new int[]{1,2,3});
		//test(3,1,2);
		
	}
	
	protected void  finalize()
	{
		System.out.println("destroying.. :-(");
	}
	
	public static void test(double... i)
	{
		System.out.println(i.length);
	}
	
	public static void test(double a,int... i)
	{
		System.out.println(i.length);
	}

}
