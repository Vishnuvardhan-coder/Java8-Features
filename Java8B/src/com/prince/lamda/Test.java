package com.prince.lamda;

public class Test {

	public static void main(String[] args) {
		
//		A a = new C () ;
//		a.method1();
		
		A a = ()->System.out.println("From interface 'A' method");
		
		a.method1();
				
	}
}
