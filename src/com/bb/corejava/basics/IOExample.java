package com.bb.corejava.basics;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class IOExample {

	public static void main(String[] args) throws FileNotFoundException {
		
		//FileInputStream fin=new FileInputStream("abc.txt");
		InputStreamReader in=new InputStreamReader(System.in);
		//DataInputStream din=new DataInputStream(System.in);
		
		BufferedReader bf=new BufferedReader(in);
		
		Integer a=3;
		System.out.println(a.byteValue());
        int i=new Integer(10);
        test(i);
        System.out.println(i);
	}
	
	public static void test(Integer a)
	{
		
		a=new Integer(40);
		System.out.println(a);
	}

}
