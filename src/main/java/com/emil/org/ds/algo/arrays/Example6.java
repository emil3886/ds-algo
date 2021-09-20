package com.emil.org.ds.algo.arrays;

/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: nums = [5,4,-1,7,8]
Output: 23

*/

//O(n)
public class Example6 {

	private static int getMaxSubArraySum(int[] input) {

		int currentSum = 0;
		int maxsum = 0;

		for (int i : input) {
			currentSum = currentSum + i;

			if (currentSum < 0) {

				currentSum = 0;
			}

			if (currentSum > maxsum) {
				maxsum = currentSum;
			}
		}

		return maxsum;

	}

	public static void main(String[] args) {
		System.out.println(
				"Max value from sub array : " + getMaxSubArraySum(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		System.out.println(
				"Max value from sub array : " + getMaxSubArraySum(new int[] { 5,4,-1,7,8 }));
	}
}
