package com.bb.corejava.strings;

public class Test {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		String str1 = "Hello";
		
		String a = new String("a");
		
		String a1 = new String("a");
		
		System.out.println(str==str1);
		System.out.println(a==a1);
		
		System.out.println(str.charAt(0));
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(1));
		System.out.println(str.codePointCount(0, 5));
		
		System.out.println(str.equals(new StringBuffer("Hello")));
		str.equalsIgnoreCase("");
		str.compareTo("Hello");
		str.compareToIgnoreCase("hello");
		System.out.println(str.contentEquals(new StringBuffer("Hello")));
		str.contains("hel");
		
		str.startsWith("");
		str.startsWith("",4);
		str.endsWith("o");
		
		
		str.indexOf(' ');
		str.lastIndexOf("");
		str.lastIndexOf("",4);

		str.concat("world");
		str.replace("", "");
		System.out.println(str.replaceFirst("l", "*"));
		str.replaceAll("", "");

		String str2=new String("Hello");
		str.substring(0);
		str.substring(0, 2);
		str.intern();
		str.isEmpty();
		str.length();
		
		str.split(" ");
		
		System.out.println(str==str2);
		
		
		int arr[]=new int[5];
		System.out.println(arr.toString());
		
		for(int b:arr)
		{
			System.out.println(b);
		}
		
		
		

	}

}
