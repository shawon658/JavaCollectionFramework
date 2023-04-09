package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {
		
		// How to create an ArrayList form another collection using the Arraylist(collection c) constructor.
		//How to add all the elements form an existing collection to the new
		//ArrayList using the addAll() method.
		
		//create arraylist object
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
		System.out.println(firstTenPrimeNumbers);
		
		

	}

}
