package com.prince.joe.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TakingListOfStringsToStream {

	public static void main(String[] args) {
		
	List<String> alist = new ArrayList(Arrays.asList("Al" , "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hana", "Shivika"));
		
	alist.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).sorted().forEach(System.out::println);
	}
}
	