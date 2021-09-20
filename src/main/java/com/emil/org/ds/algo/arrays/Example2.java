package com.emil.org.ds.algo.arrays;

import java.util.HashSet;
import java.util.Set;

//Question : Check if the given array has a pair, whose sum equals to a given number
//Sample [1,2,6,8] is their any pair whose sum is 5 --> NO
//Brute force : 2 for loops checking sum of each element -> O(n^ 2)
//Follow up questions : will there be floating point numbers? will the input be sorted? Are there memory constraints to take into
//consideration? will be there negative numbers in the input?
//Solution with O(n) 'linear' complexity
public class Example2 {

	public static boolean hasPairWithSum(int[] input, int sum) {
		Set<Integer> reminderValues = new HashSet<>();

		for (int element : input) {
			if (reminderValues.contains(element)) {
				return true;
			}
			reminderValues.add(sum - element);

		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println("Does input contain the sum : " + hasPairWithSum(new int[] { 1, 2, 6, 8 }, 5));
		System.out.println("Does input contain the sum : " + hasPairWithSum(new int[] { 1, 2, 6, 8 }, 8));
	}

}
