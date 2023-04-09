package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefineExample {

	public static void main(String[] args) {
		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		studentMap.put(1, new Student("Ramesh", "Fadatare"));
		studentMap.put(1, new Student("Tony", "Stark"));
		studentMap.put(1, new Student("umesh", "fadatare"));
		
		System.out.println(studentMap.values());

	}

}
