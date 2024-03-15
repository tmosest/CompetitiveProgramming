package com.tmosest.competitiveprogramming.leetcode.easy;

class SplitTheArray {
	/**
	 * https://leetcode.com/contest/weekly-contest-386/problems/split-the-array/
	 * @param nums
	 * @return
	 */
	public boolean isPossibleToSplit(int[] nums) {

		int[] counts = new int[100];

		for (int i = 0; i < nums.length; i++) {
			counts[nums[i] - 1]++;
			if (counts[nums[i] - 1] > 2) {
				return false;
			}
		}

		return true;
	}
}
