package com.tmosest.competitiveprogramming.leetcode.easy;

class LongestEvenOddSubarrayWithThreshold {
	/**
	 * https://leetcode.com/problems/longest-even-odd-subarray-with-threshold/
	 * 
	 * @param nums
	 * @param threshold
	 * @return
	 */
	public int longestAlternatingSubarray(int[] nums, int threshold) {
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0 || nums[i] > threshold) {
				continue;
			}
			int count = 0;
			for (int j = i; j < nums.length; j++) {
				++count;
				max = Math.max(max, count);

				if (j == nums.length - 1) {
					break;
				}
				if (nums[j + 1] % 2 == nums[j] % 2) {
					break;
				}
				if (nums[j + 1] > threshold) {
					break;
				}
			}
		}

		return max;
	}
}
