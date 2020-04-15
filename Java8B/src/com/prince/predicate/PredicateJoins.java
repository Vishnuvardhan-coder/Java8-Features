package com.prince.predicate;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		
	
	int a[] = {2,3,4,5,6};
	
	Predicate<Integer> p = i->i>10;
	
	Predicate<Integer> p2 = i->i%2==0;
	
	
	method1(p.negate(),a);
	System.out.println("==========================");
	method1(p2,a);
	method1(p,a);
	}
	
	
	
	static void method1(Predicate<Integer> p, int[] a ){
		
		for(int eachvalue : a){
			
			if(p.test(eachvalue)){
				System.out.println(eachvalue);
			}
			
		}
	}
}
