package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PointsThatIntersectWithCars {
	/**
	 * https://leetcode.com/problems/points-that-intersect-with-cars/
	 * 
	 * @param nums
	 * @return
	 */
	public int numberOfPoints(List<List<Integer>> nums) {

		Set<Integer> set = new HashSet<>();

		for (List<Integer> list : nums) {
			for (int i = list.get(0); i <= list.get(list.size() - 1); i++) {
				set.add(i);
			}
		}
		
		return set.size();
	}
}
