package com.bb.corejava.strings;

import java.util.StringTokenizer;

public class Buffer {

	public static void main(String[] args) {
	
		StringBuffer buff=new StringBuffer("World!++++");
		buff.replace(2, 12, "Helloww");
		System.out.println(buff);
		
		StringBuilder build = new StringBuilder("155290000");
		System.out.println(build.capacity());
		
		StringTokenizer st=new StringTokenizer("shdvbsd sdnf", " ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
