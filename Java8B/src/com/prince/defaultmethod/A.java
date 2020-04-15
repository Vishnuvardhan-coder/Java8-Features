package com.prince.defaultmethod;

@FunctionalInterface
public interface A {
	void m2();
	default void m1() {
		System.out.println("from default");
	}

}
