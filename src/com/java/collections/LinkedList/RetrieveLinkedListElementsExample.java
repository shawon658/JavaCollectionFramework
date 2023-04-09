package com.java.collections.LinkedList;

import java.util.LinkedList;

public class RetrieveLinkedListElementsExample {
	
	
	// How to get first element in the LinkedList.
	//How to get the last element in the LinkedList.
	//How to get the element at a given index in the LinkedList.
	// How to get all the element form the LinkedList.
	
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<>();
		
		fruits.add("Banan");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Pineaple");
		
		//Getting the first element in the LinkedList using getFirst();
		String firstelement = fruits.getFirst();
		System.out.println("first element => " + firstelement);
		
		// Getting the last element in the LinkedList using getLast();
		
		String lastElementd = fruits.getLast();
		System.out.println("Last element => " + lastElementd);
		
		//Getting the element  at a given position in the LinkedList
		
		String element = fruits.get(1);
		System.out.println("element " + element);
		
		//System.out.println(fruits);
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
	}

}
