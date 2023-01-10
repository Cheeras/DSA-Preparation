package com.arrays;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(434);
		list.add(354);
		list.add(346);
		list.add(34);
		System.out.println(list);
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		list.set(0, 99);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
	}

}
