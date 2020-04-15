package com.prince.defaultmethod;

public class Test {

	public static void main(String[] args) {

		A a = ()-> System.out.println("From A method");
		a.m1();
		a.m2();
	}

}
