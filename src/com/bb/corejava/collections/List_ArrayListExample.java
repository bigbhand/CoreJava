package com.bb.corejava.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bb.corejava.resource.IDComparator;
import com.bb.corejava.resource.NameComparator;
import com.bb.corejava.resource.PriceComparator;
import com.bb.corejava.resource.Product;

public class List_ArrayListExample {

	public static void main(String[] arg) throws NumberFormatException, IOException
	{
		List<String> stringList=new ArrayList<String>();
		List<Product> productList=new ArrayList<Product>();
		
		System.out.println("/************** String List ************/");
		
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Pineapple");
		stringList.add("Orange");
		stringList.add("Mango");
		stringList.add("Cherry");
		
		System.out.println("Before Sorting.........");
		System.out.println(stringList);
		
		Collections.sort(stringList);
		
		System.out.println("\nAfter Sorting.........");
		System.out.println(stringList);
		
		System.out.println("");
		
		List<String> sl2=new ArrayList<>();
		sl2.add("Apple");
		sl2.add("Mango");
		
		System.out.println("Difference  : "+stringList.removeAll(sl2));
		System.out.println(stringList);
		
		stringList.addAll(sl2);
		System.out.println("");
		System.out.println("Inersection : "+stringList.retainAll(sl2));
		System.out.println(stringList);
		
		System.out.println("");
		System.out.println("/************** Product List ************/");
		
		productList.add(new Product(111," Radio        ",2000));
		productList.add(new Product(222," Televison    ",8000));
		productList.add(new Product(333," Refrigerator ",1000));
		productList.add(new Product(444," Fan          ",3000));
		productList.add(new Product(555," Bulb         ",150));
		productList.add(new Product(666," Speaker      ",800));
		
		for(Product p:productList)
		{
			System.out.println(p);
		}
		while(true)
		{
			System.out.println("\n***Press 1 to Sort by ID***");
			System.out.println("***Press 2 to Sort by Name***");
			System.out.println("***Press 3 to Sort by Price***");
			
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(in);
			
			int choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
			case 1:
				Collections.sort(productList,new IDComparator());
				break;
				
			case 2:
				Collections.sort(productList,new NameComparator());
				break;
				
			case 3:
				Collections.sort(productList,new PriceComparator());
				break;

			default:
				break;
			}
			
			for(Product p:productList)
			{
				System.out.println("\t"+p);
			}
			System.out.println(productList.contains(new Product(111," Radio        ",2000) ));
		}
		
		
	}
	
}
