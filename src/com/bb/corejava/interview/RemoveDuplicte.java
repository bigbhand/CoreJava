package com.bb.corejava.interview;

public class RemoveDuplicte {

	public static void main(String[] args) {
		
		char[] bb = {'c','l','o','c','k'};
		char[] cc = new char[bb.length];
		int i=0;
		for(char b : bb){
			
			boolean isExist=false;
			for(char c : cc){
				if(b == c){
					isExist=true;
					break;
				}
			}
			
			if(!isExist)
				cc[i++]=b;
		}
		
		for(char c : cc){
			System.out.println(c);
		}
	}
}
