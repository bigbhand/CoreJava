package com.bb.corejava.basics;

import java.util.ArrayList;
import java.util.List;

public class Basic {

	public static void main(String[] args) {
		
		int a=10;
		
		Integer b=new Integer("150");
		Float f=new Float("555.336");
		Character ch=48;
		//System.out.println(ch);
		Number n=new Float(-129);
		System.out.println(n.byteValue());
		
		CharSequence chs=new CharSequence() {
			
			@Override
			public CharSequence subSequence(int start, int end) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int length() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public char charAt(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		char[] car={'1',120,'c'};
		for(char c:car)
		{
			System.out.println(c);
		}
	//	System.arraycopy(arg0, arg1, arg2, arg3, arg4);
		char c=111;
		System.out.println("*********************");
		
		String[] arr=new String[5];
		arr[0]="0";
		arr[1]="1";
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
