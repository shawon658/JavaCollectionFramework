package com.java.collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIteratationExample {

	public static void main(String[] args) {
		
		LinkedList<String> progLangs = new LinkedList<>();
		
		progLangs.add("C");
		progLangs.add("Java");
		progLangs.add("C++");
		progLangs.add("Spring Framework");
		progLangs.add("Java EE");
		progLangs.add("Hibernate Framework");
		
		boolean result = progLangs.contains("C");
		
		System.out.println("Result = " + result);
		
		//Find the index of the first occurance of an element in the LinkedList
		
		int index = progLangs.indexOf("Java EE");
		System.out.println(index);
		
		int lastIndex = progLangs.lastIndexOf("Spring Framework");
		
		System.out.println("Last Index => " + lastIndex);
		
		//iterator
		
		Iterator<String> iterator = progLangs.iterator();
		
		while(iterator.hasNext()) {
			String prog = (String)iterator.next();
			System.out.println(prog);
		}
		
		//for each
		
		
		progLangs.forEach((element)-> {
			System.out.println(element);
		});
		
		//for each advance loop
		for(String e:progLangs) {
			System.out.println(e);
		}
		
		
		
		//simple for loop
		

	}

}
