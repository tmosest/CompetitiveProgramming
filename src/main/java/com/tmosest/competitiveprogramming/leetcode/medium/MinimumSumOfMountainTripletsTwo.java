package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumSumOfMountainTripletsTwo {
	/**
	 * https://leetcode.com/problems/minimum-sum-of-mountain-triplets-ii/
	 * 
	 * @param nums
	 * @return
	 */
	public int minimumSum(int[] nums) {
		int[] minLeft = new int[nums.length];
		int[] minRight = new int[nums.length];
		minLeft[0] = nums[0];
		minRight[nums.length - 1] = nums[nums.length - 1];
		for (int i = 1; i < nums.length; i++) {
			minLeft[i] = Math.min(minLeft[i - 1], nums[i]);
		}
		for (int i = nums.length - 2; i >= 0; i--) {
			minRight[i] = Math.min(minRight[i + 1], nums[i]);
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] > minLeft[i - 1] && nums[i] > minRight[i + 1]) {
				min = Math.min(min, nums[i] + minLeft[i - 1] + minRight[i + 1]);
			}
		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}
}
