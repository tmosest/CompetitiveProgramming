package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class MinimumNumberGame {
	/**
	 * https://leetcode.com/problems/minimum-number-game/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int[] numberGame(int[] nums) {
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i += 2) {
			int temp = nums[i];
			nums[i] = nums[i + 1];
			nums[i + 1] = temp;

		}
		return nums;
	}
}
