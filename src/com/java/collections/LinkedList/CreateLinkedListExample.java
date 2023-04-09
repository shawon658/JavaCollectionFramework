package com.java.collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {
	
	//add();
	//add(2, element name);
	
	//addFirst();
	//addLast(); First and last both are coming form DeQueue interface
	
	//LinkedList implements both List and Dequeue
	
	
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banan");
		fruits.add("Mango");
		fruits.add("Apple");
		
		System.out.println("Initial linkedList -> " + fruits);
		
		//Adding an element at the specified position in the LinkedList
		fruits.add(2, "Watermelon");
		
		System.out.println("After adding Watermelon => " + fruits);
		
		// Adding an element at the beginning of the LinkedList
		
		fruits.addFirst("Strawberry");
		
		System.out.println("after adding strawberry => " + fruits);
		
		//Adding an element at the end of the LinkedList
		
		fruits.addLast("Orange");
		System.out.println("After adding orange => " + fruits);
		
		
		

	}

}
