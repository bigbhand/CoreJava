package com.bb.corejava.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveWhitespace {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		System.out.println("Enter a String:");
		String input = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		int count=0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)!=' '){
				sb.append(input.charAt(i));
			}
			else{
				count++;
			}
		}
		
		System.out.println("Successfully removed "+count+" number of sapaces");
		System.out.println("Resulted STring is : "+sb.toString());

	}

}
