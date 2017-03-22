package com.bb.corejava.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.bb.corejava.resource.Key;
import com.bb.corejava.resource.Product;

public class Map_LinkedHashMapExample {

	public static void main(String[] arg)
	{
		Map<Integer,String> stringMap=new LinkedHashMap<>();
		Map<Key,Product> productMap=new LinkedHashMap<>();
		
		stringMap.put(new Integer(111), "one");
		stringMap.put(new Integer(222), "two");
		stringMap.put(new Integer(333), "three");
		stringMap.put(new Integer(444), "four");
		stringMap.put(new Integer(444), "five");
		
		System.out.println(stringMap);
		
		Key k1=new Key("k1");
		Key k2=new Key("k1");
		/*Key k1=new Key();
		Key k2=new Key();*/
		
		productMap.put(new Key("p111"), new Product(111, "Google", 6000));
		productMap.put(new Key("p222"), new Product(222, "Yahoo!", 5000));
		productMap.put(new Key("p333"), new Product(333, "Bing", 4000));
		productMap.put(new Key("p444"), new Product(444, "Just Dial", 9000));
		productMap.put(new Key("p555"), new Product(555, "BigBhand", 6500));
		productMap.put(new Key("p666"), new Product(666, "Facebook", 8000));
		productMap.put(k1, new Product(777, "Whatsapp", 1000));
		productMap.put(k2, new Product(888, "Twitter", 2000));
		
		for(Map.Entry p : productMap.entrySet())
		{
			System.out.println(p.getKey()+" : "+p.getValue());
		}
		
		Iterator<Map.Entry<Integer, String>> itr = stringMap.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
