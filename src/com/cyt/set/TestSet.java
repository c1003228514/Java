package com.cyt.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
//		Set<String> sets = new HashSet<>();
//		sets.add("aaa");
//		sets.add("bbb");
//		sets.add("ccc");
//		sets.add("ddd");
//		
//		sets.add("bbb");
//		
//		for (String s : sets) {
//			System.out.println(s);
//		}
		
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("jim",23));
		set.add(new Person("tom",22));
		set.add(new Person("lucy",20));
		set.add(new Person("zhangsan",19));
		set.add(new Person("zhangsan",19));
		
		System.out.println(set.size());
		
		Iterator<Person> ites = set.iterator();
		while(ites.hasNext()) {
			Person p = ites.next();
			System.out.println(p);
		}
		
		
	}
	
}
