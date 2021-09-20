package com.emil.org.ds.algo.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Question : Check if 2 arrays have a common element
//Linear complexity O(n)
//Questions to ask
//1. Will the input be sorted?
//2. What will be the size of the input, is to too large, any memory constraints to think about?
//3. What will be the input/output, will it always be a string array?
//4. Always start with brute force approach, here using 2 for loops with O(n^2) complexity, no need to type that code
//5. Think of different error scenarios and test the code

public class Example1 {

	private static boolean containsCommonItem(String[] arr1, String[] arra2) {

		Set<String> elements = new HashSet<>();
		elements.addAll(Arrays.asList(arr1 != null ? arr1 : new String[] {}));

		List<String> data = Arrays.asList(arra2 != null ? arra2 : new String[] {});
		for (String ele : data) {
			if (!elements.add(ele)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) {

		String[] arr1 = new String[] { "a", "e", "i", "o" };
		String[] arr2 = new String[] { "R", "P", "S" };
		String[] arr3 = new String[] { null, "P", "S" };
		System.out.println("Is there anything common ? " + containsCommonItem(arr1, arr1));
		System.out.println("Is there anything common ? " + containsCommonItem(arr1, arr2));
		System.out.println("Is there anything common ? " + containsCommonItem(arr2, arr3));
		System.out.println("Is there anything common ? " + containsCommonItem(arr2, null));
		System.out.println("Is there anything common ? " + containsCommonItem(null, arr2));
	}
}
