package com.cyt.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		/*Set<String> sets = new TreeSet<>();
		sets.add("A");
		sets.add("D");
		sets.add("E");
		sets.add("C");
		sets.add("B");
		
		for (String s : sets) {
			System.out.println(s);
		}*/
		
		Set<Person> sets = new TreeSet<>();
		sets.add(new Person("jim",23));
		sets.add(new Person("tom",22));
		sets.add(new Person("lucy",20));
		sets.add(new Person("zhangsan",19));
		
		for (Person p : sets) {
			System.out.println(p);
		}
	}
	
}
