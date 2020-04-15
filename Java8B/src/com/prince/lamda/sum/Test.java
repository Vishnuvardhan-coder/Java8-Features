package com.prince.lamda.sum;

public class Test {
	public static void main(String[] args) {
		
//	
//	Sum a = (int x, int y)-> System.out.println("The sum is "+ (x+y));
//	
//	a.add(10, 20);
		
		Sum a = (x,y)->System.out.println("The sum is "+(x+y));
			a.add(10, 20);
	}
}
