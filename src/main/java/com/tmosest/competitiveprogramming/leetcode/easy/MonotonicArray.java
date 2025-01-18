package com.tmosest.competitiveprogramming.leetcode.easy;

class MonotonicArray {

	public boolean isMonotonic(int[] nums) {

		if (nums.length < 2) {
			return true;
		}

		boolean isIncreasing = false;
		boolean isDecreasing = false;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				isIncreasing = true;
			}

			if (nums[i] < nums[i - 1]) {
				isDecreasing = true;
			}
		}

		if (isDecreasing && isIncreasing) {
			return false;
		}

		return true;
	}
}
