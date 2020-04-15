package com.prince.joe.streams;

import java.util.stream.Stream;

public class TakingStringArrayToStream {

	public static void main(String[] args) {
		
		String a[] = {"Al" , "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hana", "Shivika"};
		
		 Stream.of(a)                //Arrays.stream(a)
		.filter(x->x.startsWith("S"))
		.sorted()
		.forEach(System.out::println);
		
		
	}
}
