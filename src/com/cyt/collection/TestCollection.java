package com.cyt.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {

	Object[] obj ;
	
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("1");
		col.add("2");
		col.add("3");
		
		Collection zCol = new ArrayList();
		zCol.add("zhangsan ");
		zCol.add("lisi");
		
		//col.clear();
		if(col.contains("1")) {
			System.out.println(true);
		}
		
		if (col.equals(zCol)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		System.out.println(col.hashCode());
		System.out.println(col.isEmpty()+"  isEmpty");
		col.remove("3");
		for (Object obj : col) {
			System.out.println(obj);
		}
	}
	
}
