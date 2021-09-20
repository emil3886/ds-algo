package com.emil.org.ds.algo.recursion;

import java.util.HashMap;
import java.util.Map;

// Given a number N return the index value of the fibonacci sequence,
// where the sequence is

// 0,1,1,2,3,5,8,13,21,34,55,89, 144
// each value in the sequence is the sum of previous 2 values in the sequence
public class Example2 {

	//O(n)
	private static int fibonacciIteratively(int index) {
		Map<Integer, Integer> fiboSeries = new HashMap<>();
		for (int i = 0; i <= index; i++) {
			if (i == 0 || i == 1) {
				fiboSeries.put(i, i);
			} else {
				fiboSeries.put(i, fiboSeries.get(i-1)+fiboSeries.get(i-2));
			}
		}

		return fiboSeries.get(index);
	}

	
	
	//Complexity O(2^n) -> exponential . This even though
	//is a readable solution is not ideal. There are lots
	// of function calls happening.
	  private static int fibonacciRecursively(int index) {
		  
		  if(index == 0 || index == 1) {
			  return index;
		  }else {
			  return fibonacciRecursively(index-1) + fibonacciRecursively(index-2);
		  }
	  
	  }
	 

	public static void main(String[] args) {
		System.out.println("Index 7 fibonacciIteratively : " + fibonacciIteratively(7));
		System.out.println("Index 0 fibonacciIteratively : " + fibonacciIteratively(0));
		System.out.println("Index 7 fibonacciRecursively : " + fibonacciRecursively(7));
		System.out.println("Index 0 fibonacciRecursively : " + fibonacciRecursively(0));
		System.out.println("Index 8 fibonacciRecursively : " + fibonacciRecursively(8));
		System.out.println("Index 21 fibonacciRecursively : " + fibonacciRecursively(21));
	}
}
