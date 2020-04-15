package com.prince.predicate;

import java.util.function.Predicate;

public class PredicateIntExample {

	public static void main(String[] args) {

		Predicate<Integer> p = (i) -> (i > 20);

		System.out.println(p.test(15));
		System.out.println(p.test(25));
		System.out.println(p.test(35));
	}
}
