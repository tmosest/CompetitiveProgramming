package com.tmosest.competitiveprogramming.leetcode.easy;

class MaximumStrongPairXorOne {
	/**
	 * https://leetcode.com/problems/maximum-strong-pair-xor-i/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int maximumStrongPairXor(int[] nums) {
		int max = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j]))
					max = Math.max(max, nums[i] ^ nums[j]);
			}
		}

		return max;
	}
}
