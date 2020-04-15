package com.prince.joe.streams;

import java.util.stream.Stream;

public class UsingOfStreamOf {

	public static void main(String[] args) {

		Stream.of("Ava", "Aneri", "Alberto").sorted().forEach(System.out::println);// Alberto
																					// Aneri
																					// Ava

		// Stream.of("Ava", "Aneri",
		// "Alberto").sorted().findFirst().ifPresent(System.out::println);//Alberto

	}
}
