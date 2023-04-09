package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetFromCollectionExample {
	
	//Create a hashset form another collection using the HashSet(Collection c) constructor
	//Add all the elements form a collection fo the HashSet using addAll() method
	
	public static void main(String[] args) {
		
		//first 5 even numbers
		Set<Integer> firstFiveNumbes = new HashSet<>();

		firstFiveNumbes.add(2);
		firstFiveNumbes.add(4);
		firstFiveNumbes.add(6);
		firstFiveNumbes.add(8);
		firstFiveNumbes.add(10);
		
		Set<Integer> tenEvenNumbers = new HashSet<>(firstFiveNumbes);
		System.out.println(tenEvenNumbers);
		
		Set<Integer> nextFiveNumbers = new HashSet<>();
		tenEvenNumbers.add(12);
		tenEvenNumbers.add(14);
		tenEvenNumbers.add(16);
		tenEvenNumbers.add(18);
		tenEvenNumbers.add(20);
		
		//Add all the elements from a collection to the HsshSet using the Addall() method
		tenEvenNumbers.addAll(nextFiveNumbers);
		System.out.println(tenEvenNumbers);
	}

}
