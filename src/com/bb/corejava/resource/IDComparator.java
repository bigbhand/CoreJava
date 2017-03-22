package com.bb.corejava.resource;

import java.util.Comparator;

public class IDComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getProductID()==o2.getProductID())
			return 0;
		else if (o1.getProductID()<o2.getProductID())
			return -1;
		else
			return 1;
	}

}
