package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsArrayList {

	//Remove() method
	//removeAll()
	//clear()
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		
		System.out.println(fruits);
		fruits.remove(4);
		System.out.println("After removing at index 4 => " + fruits);
		
		fruits.remove("Mango");
		System.out.println("After removing at index 2 => " + fruits);
		
		//Remove all the elements that exist in a given collection
		
		List<String> subFruits = new ArrayList<>();
		subFruits.add("Banana");
		subFruits.add("Apple");
		
		fruits.removeAll(subFruits);
		System.out.println(subFruits);
		
		// clear() method
		//fruits.clear();
		//System.out.println(fruits);

	}

}
