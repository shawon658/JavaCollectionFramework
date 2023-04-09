package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		//List allow to add duplicate elements
		
		list.add("element1");
		list.add("element1");
		list.add("element2");
		list.add("element2");
		
		System.out.println(list);
		
		//List allows us to have 'Null'value
		
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		
		//Insertion order
		
		list.add("element1");//0
		list.add("element2");//2
		list.add("element3");//3
		list.add("element4");//4
		list.add("element5");//5
		
		System.out.println(list);
		
		// Access elements form list
		
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
		
		
	}

}
