package com.perscholas.hashsetstreesets;

import java.util.HashSet;

public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet1: "+ evenNumbers);
		
		
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(3);
		System.out.println("HashSet: " + numbers);
		
		//Union of two sets
		
		numbers.addAll(evenNumbers);
		System.out.println("Union is: " + numbers);
		
		
		

	}

}
