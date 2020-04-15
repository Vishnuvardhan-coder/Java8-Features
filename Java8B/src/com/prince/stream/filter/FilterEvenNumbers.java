package com.prince.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {


		List<Integer> alist = new ArrayList<>();
	
	     for(int i=0; i<=10; i++){
	    	 
	    	 alist.add(i);
	     }
	
	     
//	     List<Integer> alist2 = new ArrayList<>();
	     
//	     
//	     for(int eachvalue : alist){
//	    	 
//	    	 if(eachvalue%2==0){
//	    		 alist2.add(eachvalue);
//	    	 }
	     
	  List<Integer> l =  alist.stream().filter(i->i%2==0).collect(Collectors.toList());
	     
	  l.forEach(System.out::println);
	     
	     
	}

}
