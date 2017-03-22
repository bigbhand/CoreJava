package com.bb.corejava.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.bb.corejava.resource.Product;

public class Map_HashMapExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Map<Integer,String> stringMap=new HashMap<>();
		Map<String,Product> productMap=new HashMap<>();
		
		stringMap.put(111, "one  ");
		stringMap.put(222, "two  ");
		stringMap.put(333, "three");
		stringMap.put(444, "four ");
		stringMap.put(555, "five ");
		stringMap.put(666, "six  ");
		
		System.out.println(stringMap);
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		while(true)
		{
			System.out.println("\nEnter 1 for Search by Key..");
			System.out.println("Enter 2 for Search by Value..");
			int choice=0;
			try
			{
				choice = Integer.parseInt(br.readLine());
			}	catch(Exception e){
				
			}
			
			switch (choice) 
			{
				case 1:
					System.out.println("Search for data..");
					try
					{
						int key=Integer.parseInt(br.readLine());
						System.out.println("Search results..");
						boolean flag1=true;
						
						for(Map.Entry<Integer, String> entry : stringMap.entrySet())
						{
							if(entry.getKey()==key)
							{
								System.out.println(entry.getKey()+" "+entry.getValue());
								flag1=false;
								break;
							}
						}
						if(flag1)
							System.out.println("-0- results found");
					}catch(Exception e){
						
					}
					break;
					
				case 2:
					System.out.println("Search for data..");
					String value=br.readLine();
					System.out.println("Search results..");
					boolean flag2=true;
					for(Map.Entry<Integer, String> entry : stringMap.entrySet())
					{
						if(entry.getValue().contains(value))
						{
							System.out.println(entry.getKey()+" "+entry.getValue());
							flag2=false;
							break;
						}
					}
					if(flag2)
						System.out.println("-0- results found");
					break;
	
				default:
					break;
			}
				
		}
	}

}
