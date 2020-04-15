package com.prince.function;

import java.util.function.Function;

public class FunctionExample {
	
	public static void main(String[] args) {
		
	

	Function<String,Integer> f = s->s.length() ;
	
	 System.out.println(f.apply("xyz"));
	 System.out.println(f.apply("Raj"));
}}
