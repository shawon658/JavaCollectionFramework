package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
	
	//How to check if an ArrayList is empty using the isEmpty() method.
	//How to find the size of an ArrayList using size() method.
	//How to access the elements at a particular index in an ArrayList using the get()method.
	//How to modify the element at a particular index in an ArrayList using the set() method.
	
	public static void main(String[] args) {
		
		List<String> topProgrammingLanguages = new ArrayList<>();
		
		//Check if an ArrayList is empty
		
		System.out.println("Is the topProgrammingLanguages list empty? : " + topProgrammingLanguages.isEmpty());
		
		topProgrammingLanguages.add("c");
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("C++");
		topProgrammingLanguages.add("python");
		topProgrammingLanguages.add(".net");
		
		System.out.println("Here are the top " + topProgrammingLanguages.size() + " Programming Language is the world");
		
		//Retrieve the element at a given index
		
		String bestProgrammingLanguage = topProgrammingLanguages.get(1);
		System.out.println("bestProgrammingLang => " + bestProgrammingLanguage);

		String secondProgrammingLanguage = topProgrammingLanguages.get(3);
		System.out.println("bestProgrammingLang => " + secondProgrammingLanguage);
		
		//Modify the element at a given index
		
		topProgrammingLanguages.set(4, "new C++");
		System.out.println(topProgrammingLanguages);
	}

}
