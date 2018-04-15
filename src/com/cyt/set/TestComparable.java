package com.cyt.set;

import java.util.Arrays;

public class TestComparable {

	public static void main(String[] args) {
		Person[] p = {new Person("jim",22),new Person("tom",23),
				new Person("lucy",20),new Person("hanmeimei",20)};
		
		for (Person pp : p) {
			System.out.println(pp);
		}
		
		System.out.println("====================================");
		
		Arrays.sort(p);
		for (Person pp : p) {
			System.out.println(pp);
		}
		
	}
	
}
