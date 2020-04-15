package com.prince.joe.streams;

import java.util.stream.IntStream;

public class IntegerStream {
	public static void main(String[] args) {
		
	

	IntStream
	.range(1,10)
	//.skip(5) // it will print 6789 skips element until 5
	.forEach(System.out::print);

	}
	}
