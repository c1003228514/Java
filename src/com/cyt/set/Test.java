package com.cyt.set;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Medal> sm = new TreeSet<>();
		sm.add(new Medal("�й�",42,32,12));
		sm.add(new Medal("����",12,32,12));
		sm.add(new Medal("Ӣ��",12,22,12));
		sm.add(new Medal("�ձ�",22,32,12));
		sm.add(new Medal("�ն���",22,33,12));
		
		for (Medal mm : sm) {
			System.out.println(mm);
		}
	}
}
