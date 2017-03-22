package com.bb.corejava.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class TryCatch {

	public static void main(String[] args) {
		
		List<String> a = new ArrayList<>();
		Set<String> b = new LinkedHashSet<>();
		
		ListIterator<String> itr = a.listIterator();
		
		b.add(null);
		b.add(null);
		System.out.println(b);
		
		Collections.sort(a);
		Map<String, String> map = new HashMap<String, String>();
		map.put(null, "Hi");
		map.put(null, "bye");
		System.out.println(map);
	}

}
