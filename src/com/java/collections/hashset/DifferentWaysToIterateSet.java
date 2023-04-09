package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysToIterateSet {
	
	
	// Enhanced for loop
	// basic loop with iterator
	//while loop with iterator
	//JDK 8 foreach() mehtod with lambda
	//JDK 8 streaming + forEach() + lambda expression

	public static void main(String[] args) {
		
		Set<String> courses = new HashSet<String>();
		
		courses.add("Java");
		courses.add("C");
		courses.add("C++");
		courses.add("python");
		courses.add("Scala");
		
		//Enhanced for loop
		
		for(String course:courses) {
			System.out.println(course);
		}
		
		//basic loop with iterator
		
		for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String)iterator.next();
			System.out.println(course);
		}
		
		//while loop with iterator
		Iterator<String> iterator = courses.iterator();
		
		while(iterator.hasNext()) {
			String course = (String)iterator.next();
			System.out.println(course);
		}
		//JDK 8 foreach() mehtod with lambda
		
		courses.forEach(course -> System.out.println(course));
		
		//JDK 8 streaming + forEach() + lambda expression
		
		courses.stream().filter(course -> ! "Java" .equals(course))
			.forEach(course -> System.out.println(course));
		
	}

}
