package com.bb.corejava.interview;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = new String("i love my work!!");
		
		resverseByCharacter(str);
		
		resverseByWord(str);

	}
	
	public static void resverseByCharacter(String str) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
	}
	
	public static void resverseByWord(String str) {
		
		StringBuilder sb = new StringBuilder();
		String[] subset = str.split(" ");
		
		for(int i=subset.length-1;i>=0;i--){
			sb.append(subset[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}

}
