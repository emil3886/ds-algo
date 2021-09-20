package com.emil.org.ds.algo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Merge sorted arrays
//Points to think
//Is the input Integers or any other data type?
//What is the sort order asc/desc
//problem with the below solution, since it uses set
// if the input arrays have a common element, it wont be duplicated 
public class Example4 {

	private static Integer[] mergeSortedArraysEliminatingDuplicates(Integer[] in1, Integer[] in2) {
		Set<Integer> mergedData = new TreeSet<>();
		if (in1 != null && in2 != null && in1.length>0 && in2.length>0) {
			mergedData.addAll(Arrays.asList(in1));
			mergedData.addAll(Arrays.asList(in2));
			return mergedData.stream().toArray(Integer[]::new);
		}
		// handle other scenarios like, if one of the input is empty return the non empty array as is
		return null;

	}
	
	private static Integer[] mergeSortedArrays(Integer[] in1, Integer[] in2) {
		List<Integer> mergedData = new ArrayList<>();
		if (in1 != null && in2 != null && in1.length>0 && in2.length>0) {
			mergedData.addAll(Arrays.asList(in1));
			mergedData.addAll(Arrays.asList(in2));
			return mergedData.stream().sorted().toArray(Integer[]::new);
		}
		
		return null;
	}

	public static void main(String[] args) {
		Integer[] in1 = new Integer[] { 3, 4,7, 9, 11 };
		Integer[] in2 = new Integer[] { 2, 4, 6, 8, 10 };
		Integer[] mergeSortedArrays = mergeSortedArraysEliminatingDuplicates(in1, in2);
		System.out.println("Merge sorted arrays output : ");
		for(int i : mergeSortedArrays) {
			System.out.println(i);
		}
		
		mergeSortedArrays = mergeSortedArrays(in1, in2);
		System.out.println("Merge sorted arrays output : ");
		for(int i : mergeSortedArrays) {
			System.out.println(i);
		}
	}
}
