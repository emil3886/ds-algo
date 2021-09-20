package com.emil.org.ds.algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]*/
public class Example7 {

	private static Integer[] moveZerosToTheEnd(Integer[] input) {

		List<Integer> vals = new ArrayList<>();
		int zeroCount = 0;

		List<Integer> inputList = Arrays.asList(input);
		for (Integer val : inputList) {
			if (val == 0) {
				zeroCount++;
			}else {
				vals.add(val);
			}
			
		}

		IntStream.rangeClosed(0, zeroCount-1).forEach(ele -> vals.add(0));

		return vals.stream().toArray(Integer[]::new);

	}

	public static void main(String[] args) {
		Integer[] result = moveZerosToTheEnd(new Integer[] { 0, 1, 0, 3, 12 });
		for(Integer val : result) {
			System.out.println(val);
		}
		System.out.println("===================");
		result = moveZerosToTheEnd(new Integer[] { 0});
		for(Integer val : result) {
			System.out.println(val);
		}
	}

}
