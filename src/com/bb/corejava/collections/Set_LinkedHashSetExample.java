package com.bb.corejava.collections;

import java.util.LinkedHashSet;
import java.util.Set;

import com.bb.corejava.resource.Product;

public class Set_LinkedHashSetExample {

	public static void main(String[] arg)
	{
		Set<String> stringSet=new LinkedHashSet<>();
		Set<Product> productSet=new LinkedHashSet<>();
		
		System.out.println("/************** String List ************/\n");
		
		stringSet.add("Cat");
		stringSet.add("Dog");
		stringSet.add("Donkey");
		stringSet.add("Monkey");
		stringSet.add("Cow");
		stringSet.add("Tiger");
		stringSet.add("Lion");
		
		String s=new String("Lion");
		stringSet.add(s);
		System.out.println(s.hashCode());
		
		String s2=new String("Lion");
		stringSet.add(s2);
		System.out.println(s2.hashCode());
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));

		//Set doesn't support "listIterator()"to iterate back n forth
		
		//common methods: addAll(),removeAll(),retainAll(),containesAll(),equals() etc..
		
		//Linked Hash Set maintains the insertion order..
		
		for(String str : stringSet)
		{
			System.out.println(str+"--->"+str.hashCode());
		}
		
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
		
		
	}
}
