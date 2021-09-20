package com.emil.org.ds.algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
		
Could you do it in-place with O(1)?		*/
		
public class Example8 {

	private static Integer[] rotateArrayBySteps(Integer[] input, int k) {
		
		List<Integer> data = Arrays.asList(input);
		List<Integer> results = new ArrayList<>();
		int index= data.size() - k;
		results.addAll(data.subList(index, data.size()));
		results.addAll(data.subList(0, index));
		return results.stream().toArray(Integer[]:: new);
	}
	
	public static void main(String args[]) {
		Integer[] rotateArrayBySteps = rotateArrayBySteps(new Integer[] {1,2,3,4,5,6,7},3);
		for(int i : rotateArrayBySteps) {
			System.out.println(i);
		}
		
	}
}
