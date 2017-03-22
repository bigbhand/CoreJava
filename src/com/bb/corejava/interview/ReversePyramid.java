package com.bb.corejava.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReversePyramid {

	public static void main(String[] args) {
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		int size  = 0;
		boolean isOK = true;
		
		while(isOK)
		{
			System.out.println("Enter the pyramid size:");
			try{
				
				size = Integer.parseInt(br.readLine());
				isOK=false;
			
			}catch(Exception  ex){
				System.out.println("Invalid input!!");
				isOK=true;
			}
		}
		
		for(int rowCount=size;rowCount>=1;rowCount--)
		{
			for(int i=rowCount; i<= size ; i++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=rowCount;i++)
			{
				System.out.print(rowCount+" ");
			}
			
			System.out.println("");
		}

	}

}
