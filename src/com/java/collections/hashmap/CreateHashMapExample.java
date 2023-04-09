package com.java.collections.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHashMapExample {

	public static void main(String[] args) {
		
		//example to map numbers to string
		Map<String, Integer> nmberMapping = new HashMap<>();
		
		//add key-value to map
		nmberMapping.put("one", 1);
		nmberMapping.put("Two", 2);
		nmberMapping.put("Three", 3);
		nmberMapping.put("Four", 4);
		nmberMapping.put("Five", 5);
		nmberMapping.put(null, 6);
		nmberMapping.put(null, 7);//it will replace the 6 because it take only one time null
		
		System.out.println(nmberMapping);
		
		//check if a hashmap is empty
		System.out.println(nmberMapping.isEmpty());
		
		// Find the size of a HashMap
		
		System.out.println(nmberMapping.size());
		
		//check if a key exist in the Hashmap
		if(nmberMapping.containsKey("Four")) {
			System.out.println("Exists");
		}else {
			System.out.println("Not Exists.");
		}
		
		//contains value or not
		
		if(nmberMapping.containsValue(4)) {
			System.out.println("Exists");
		}else {
			System.out.println("Not Exists.");
		}
		
		//get value by key
		
		Integer v1 = nmberMapping.get("one");
		System.out.println(v1);
		
		//How to remove keys form hashmap
		
		nmberMapping.remove("one");
		System.out.println(nmberMapping);
		
		//get only keys form Hashmap
		
		Set<String> keys = nmberMapping.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = nmberMapping.values();
		System.out.println(values);
		
		//different ways to iterate over hashmap
		for(Map.Entry<String, Integer> entry: nmberMapping.entrySet()) {
			System.out.println("Key ->" + entry.getKey() + " value->" + entry.getValue());
		}
		
		//using iterator
		Set<Map.Entry<String, Integer>> entries = nmberMapping.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
				while(iterator.hasNext()) {
					Map.Entry<String, Integer> entry = iterator.next();
					System.out.println("Key ->" + entry.getKey() + " value->" + entry.getValue());
				}
		
		// hashMap using java 8 forEach
				nmberMapping.forEach((K, V)->{
					System.out.println(" K "+K);
					System.out.println(" V "+V);
				});
	}

}
