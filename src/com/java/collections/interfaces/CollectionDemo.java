package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection<String> fruitCollection = new ArrayList<>();
		
		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");
		System.out.println(fruitCollection);
		//removing banana from collection list with remove method
		fruitCollection.remove("banana");
		System.out.println(fruitCollection);
		
		System.out.println(fruitCollection.contains("apple"));
		
		fruitCollection.forEach((element) ->{
			System.out.println(element);
		});
		
		//clear collection
		/*fruitCollection.clear();
		System.out.println(fruitCollection);*/
	}

}
