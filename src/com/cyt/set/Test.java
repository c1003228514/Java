package com.cyt.set;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Medal> sm = new TreeSet<>();
		sm.add(new Medal("中国",42,32,12));
		sm.add(new Medal("美国",12,32,12));
		sm.add(new Medal("英国",12,22,12));
		sm.add(new Medal("日本",22,32,12));
		sm.add(new Medal("日耳曼",22,33,12));
		
		for (Medal mm : sm) {
			System.out.println(mm);
		}
	}
}
