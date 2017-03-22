package com.bb.corejava.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.undo.CannotUndoException;

import com.sun.xml.internal.stream.Entity;

public class DuplicateCharacters {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		System.out.println("Enter a String:");
		String input = br.readLine();
		
		System.out.println("Result:");
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			int count=0;
			
			for(int j=0;j<input.length();j++)
			{
				if(input.charAt(j)==ch){
					count++;
				}
			}
			
			countMap.put(ch, count);
		}
		
		for(Entry<Character, Integer> entry : countMap.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		Iterator<Character> itr = countMap.keySet().iterator();
		while(itr.hasNext()){
			char ch = itr.next();
			System.out.println(ch +" : "+countMap.get(ch));
		}
	}

}
