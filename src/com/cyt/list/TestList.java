package com.cyt.list;

import java.util.ArrayList;
import java.util.List;

import com.cyt.collection.Student;

public class TestList {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("jim");
		list.add("tom");
		list.add("jim");
		list.add("lily");
		
		list.add(new Student("jim",22));
		
		System.out.println("���ϵĳ���:"+list.size());
		System.out.println("������:"+list.get(2));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("jimi��һ�γ��ֵ�λ��"+list.indexOf("jim"));
	}
	
}
