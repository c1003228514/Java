package com.cyt.list;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("jim");
		list.add("lucy");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===========================================");
		LinkedList<String> ll = new LinkedList<>();
		ll.add("jim");
		ll.add("lucy");
		
		ll.add("cyt");
		ll.add(1,"lxf");
		ll.offer("aaa");
		//ll.addAll(list);
		//ll.addAll(1,list);
		System.out.println("��һ��Ԫ��"+ll.getFirst());
		System.out.println("���һ��Ԫ��:"+ll.getLast());
		System.out.println(ll.indexOf("llll"));
		System.out.println("������"+ll.listIterator(1));
		System.out.println("��ȡ��ɾ��:"+ll.peek());
		System.out.println("��ȡɾ��:"+ll.poll());
		ll.push("qwr");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
	}
	
}
