package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveExample {
	
	// Remove () method - remove an element froam a HashSet.
	//RemoveAll() method - Remove all the elements that exists in a given collection form the HashSet.
	// Clear () - clear the HashSet completely by removing all elements.

	public static void main(String[] args) {
		
		//creating HashSet
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		
		//using remove() method
		
		boolean result = numbers.remove(1);
		
		System.out.println("Remove method result -> " + result);
		System.out.println(numbers);
		
		//remove all method
		
		Set<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(8);
		evenNumbers.add(10);
		
		//numbers.removeAll(evenNumbers);
		//System.out.println(numbers);
		
		//numbers.clear();
		//System.out.println(numbers);
	}

}
