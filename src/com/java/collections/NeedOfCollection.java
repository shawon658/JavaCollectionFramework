package com.java.collections;

public class NeedOfCollection {

	public static void main(String[] args) {
		
		int a =10;
		int b =20;
		int c = 20;
		
		int[] aArray = new int[10000];
		// limitation of an Array
		//1. Arrays are fixed in size
		//2.Arrays can hold only homogenous/similar type data elements
		//Array is an object in java so we can create with new keyword
		
		/*Student[] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
		//students[0] = new Book(); compoile time error;*/
		
		
		// we can overcome homogenous by using super class object we can store different data.
		/*Object[] objects = new Object[10];
		objects[0] = new Student();
		objects[1] = new Student();
		objects[2] = new Book();*/
		
		//3. ready made APIs support is not available in array
		// why do we need collection of frameworks?
		// we need collection of framework to overcome the limitaion of an array we use collection framework solve all the limitaion;
		// it was release on jdk 1.2
		
		
		
		
		
		
	}
	class Book{
		
	}
	class Student {
		
	}

}
