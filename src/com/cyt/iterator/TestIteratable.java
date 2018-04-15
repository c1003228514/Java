package com.cyt.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIteratable {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("11111");
		list.add("22222");
		list.add("33333");
		list.add("44444");
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		for (String s : list) {
//			System.out.println(s);
//		}
		Iterator<String> ites = list.iterator();
		while(ites.hasNext()) {
			String s = ites.next();
			System.out.println(s);
		}
	}
	
}
