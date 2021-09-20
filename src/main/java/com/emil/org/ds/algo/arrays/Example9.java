package com.emil.org.ds.algo.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Find MinMax
public class Example9 {

	private static Integer getValue(List<Integer> vals , int k) {
		
		
		Map<List<Integer>, Integer>  intermediateMap = new HashMap<List<Integer>, Integer>();
		for(int i=0 ; i< vals.size(); i++) {
			int toIndex = k+i;
			List<Integer> subList = null;
			if(toIndex < vals.size()) {
				subList = vals.subList(i,  toIndex);
			}else {
				subList = vals.subList(i,  vals.size());
			}
			
			
			intermediateMap.put(subList, subList.stream().sorted().findFirst().get());
		}
		
		return intermediateMap.values().stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}
	
	public static void main(String[] args) {
		
		System.out.println( getValue(Arrays.asList(new Integer[] {1,1,1}), 2));
	}
	
}
