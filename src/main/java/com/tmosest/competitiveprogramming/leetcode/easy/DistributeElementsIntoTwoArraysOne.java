package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;


class DistributeElementsIntoTwoArraysOne {

	/**
	 * https://leetcode.com/contest/weekly-contest-387/problems/distribute-elements-into-two-arrays-i/
	 * @param nums
	 * @return
	 */
	public int[] resultArray(int[] nums) {
		List<Integer> one = new ArrayList<>();
		List<Integer> two = new ArrayList<>();

		one.add(nums[0]);
		two.add(nums[1]);

		for (int i = 2; i < nums.length; i++) {
			int num = nums[i];
			if (one.get(one.size() - 1) > two.get(two.size() - 1)) {
				one.add(num);
			} else {
				two.add(num);
			}
		}

		one.addAll(two);
		return one.stream().mapToInt(i -> i).toArray();
	}
}
