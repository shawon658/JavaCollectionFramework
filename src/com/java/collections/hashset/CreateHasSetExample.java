package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHasSetExample {

	public static void main(String[] args) {
		
		//create a hashset using the hashset() constructor
		// add new elements to it using the add() method
		
		Set<String> progLangs = new HashSet<>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Java");
		progLangs.add("Python");
		progLangs.add("Scala");
		progLangs.add("JavaScript");
		
		System.out.println(progLangs);
		
		//lest add a duplicate element
		
		progLangs.add("Java");
		System.out.println(progLangs);
		
		
	}

}
