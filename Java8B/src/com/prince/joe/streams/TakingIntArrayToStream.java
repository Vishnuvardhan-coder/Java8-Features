package com.prince.joe.streams;

import java.util.Arrays;

public class TakingIntArrayToStream {
	public static void main(String[] args) {
		
		Arrays.stream(new int[] {2,4,6,8,10})
		.map(x->x*x)
		.average()
		.ifPresent(System.out::println);
		
	}

}
