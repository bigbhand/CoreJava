package com.bb.corejava.collections;

import java.util.HashSet;
import java.util.Set;

import com.bb.corejava.resource.Product;

public class Set_HashSetExample {

	public static void main(String[] arg)
	{
		Set<String> stringSet=new HashSet<>();
		Set<Product> productSet=new HashSet<>();
		
		System.out.println("/************** String List ************/\n");
		
		stringSet.add("Cat");
		stringSet.add("Dog");
		stringSet.add("Donkey");
		stringSet.add("Monkey");
		stringSet.add("Cow");
		stringSet.add("Tiger");
		stringSet.add("Lion");
		stringSet.add("Lion");
		stringSet.add(null);
		stringSet.add(null);

		
		//Set doesn't support "listIterator()"to iterate back n forth
		
		//common methods: addAll(),removeAll(),retainAll(),containesAll(),equals() etc..
		
		//Hash Set does not maintains the insertion order..
		
		System.out.println(stringSet);
		
		//External Sorting is not supported for Set
		
		System.out.println("\n/************** Product List ************/");
		
		productSet.add(new Product(111, " RAM      ", 2000));
		productSet.add(new Product(222, " HardDisk ", 6000));
		productSet.add(new Product(333, " Speaker  ", 1200));
		productSet.add(new Product(444, " Monitor  ", 8000));
		productSet.add(new Product(555, " Keyboard ", 4000));
		
		Product p1=new Product(555, " Keyboard ", 4000);
		productSet.add(p1);
		System.out.println(p1.hashCode());
		
		Product p2=p1;
		productSet.add(p2);
		System.out.println(p2.hashCode());
		
		for(Product p : productSet)
		{
			System.out.println(p +"--->"+p.hashCode());
		}
		
		/*
		 * Set does'nt allow the duplication of hashCode.. 
		   if hash code of 2 object/ref is same then they are called "duplicate data"
		 *
		 */ 
		
		get(10);
		
		
	}
	
	private static int get(Object i)
	{
		return 0;
	}
}
