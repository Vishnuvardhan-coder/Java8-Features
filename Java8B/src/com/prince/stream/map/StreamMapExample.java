package com.prince.stream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {

		List<String> alist = new ArrayList<>();

		alist.add("abc");
		alist.add("xyz");
		alist.add("mno");

		alist.forEach(System.out::println);

		List<String> alist2 = alist.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

		alist2.forEach(System.out::println);
	}
}
