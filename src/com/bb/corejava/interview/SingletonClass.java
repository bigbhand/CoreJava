package com.bb.corejava.interview;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;

public class SingletonClass {

	private SingletonClass singleton = null;
	
	public SingletonClass(){
		if(singleton==null){
			singleton = new SingletonClass();
		}
		
	}
}
