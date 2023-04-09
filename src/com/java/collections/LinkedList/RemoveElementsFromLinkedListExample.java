package com.java.collections.LinkedList;

import java.util.LinkedList;

public class RemoveElementsFromLinkedListExample {
	
	//How to remove the first element in the LinkedList
	//How to remove the last element in the linkedList
	//How to remove the first occurrences of a given element in the LinkedList
	//How to clear the LinkedList completely.

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<>();
		
		fruits.add("Banan");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Pineaple");
		
		System.out.println("Initial LinkedList = " + fruits);
		
		//remove the first element in the LinkedList
		String element = fruits.removeFirst();
		System.out.println("After removing first => " + fruits);
		
		fruits.removeLast();
		
		System.out.println("After removing last element => " + fruits);
		
		fruits.remove("Mango");
		System.out.println(fruits);
		
		//fruits.clear();
		//System.out.println(fruits);
		
		

	}

}
