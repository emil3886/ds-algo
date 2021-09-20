package com.emil.org.ds.algo.arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

/*Input: nums = [2,7,11,15], target = 18
Output: [1,2]
Output: Because nums[1] + nums[2] == 18, we return [1,2].*/
//o(n)
public class Example5 {

	private static int[] getIndexWhenSumMatchesTarget(int[] input, int target) {
		
		Map<Integer, Integer> diffMap = new HashMap<>();
		int index =0 ;
		int[] result = new int[2];
		for(int val : input) {
			
			int diff = target-val;
			if(diffMap.containsKey(val)) {
				result[0] = diffMap.get(val);
				result[1] = index;
				return result;
			}else {
				diffMap.put(diff, index);
			}
			index++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] indexes = getIndexWhenSumMatchesTarget(new int[] {2,7,11,15},18);
		System.out.println("Indexs :: ");
		for(int val : indexes) {
			System.out.println(val);
		}
	}

}
