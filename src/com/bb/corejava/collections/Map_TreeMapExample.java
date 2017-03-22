package com.bb.corejava.collections;

import java.util.Map;
import java.util.TreeMap;

import com.bb.corejava.resource.Product;

public class Map_TreeMapExample {

	public static void main(String[] arg) 
	{
		Map<Integer,String> stringMap=new TreeMap<>();
		Map<Integer,Product> productMap=new TreeMap<Integer,Product>();
		
		stringMap.put(111, "Google");
		stringMap.put(222, "Bing");
		stringMap.put(333, "Google");
		stringMap.put(444, "Google");
		
		System.out.println(stringMap);
		
		productMap.put(111, new Product(111, "gOOGLE", 5000));
		productMap.put(222, new Product(222, "yAHOO", 6000));
		productMap.put(333, new Product(333, "bIGBHAND", 8000));
		
		for(Map.Entry p : productMap.entrySet())
		{
			System.out.println(p.getKey()+" : "+p.getValue());
		}
				
	} 
}
