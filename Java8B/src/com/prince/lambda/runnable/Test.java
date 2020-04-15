package com.prince.lambda.runnable;

public class Test {

	public static void main(String[] args) {
//
//		Runnable r = new RunnableImpl();
//		
//		Thread t = new Thread(r);
//		t.start();
//		
		Runnable r = ()->{
			
			for(int i = 0 ; i<=10; i++){
				System.out.println("Child Thread");
			}
		};
		
		
		for(int i = 1; i<=10; i++){
			
			System.out.println("Main Thread");
		}
	}

}
