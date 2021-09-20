package com.emil.org.ds.algo.recursion;

//Find factorial recursively and iteratively
// 5! = 5*4*3*2*1
public class Example1 {

	private static int findFactorialIteratively(int input) {
		int result = 1 ;
		for(int i=input ; i>=1 ;i--) {
			result = result*i;
		}
		
		return result;
	}

	
	  private static int findFactorialRecursively(int input) {
		  
		  if(input == 1) {
			  return 1;
		  }else {
			  return input * findFactorialRecursively(input-1);
		  }
	  
	  }
	 

	public static void main(String[] args) {
		System.out.println("5! = " + findFactorialIteratively(5));
		System.out.println("5! = " + findFactorialRecursively(5));
	}

}
