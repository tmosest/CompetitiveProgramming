package com.tmosest.competitiveprogramming.leetcode.medium;

class CountAlternatingSubarrays {
	/**
	 * 
	 * @param nums
	 * @return
	 */
	public long countAlternatingSubarrays(int[] nums) {
		int len = nums.length;
		int[] dp = new int[len];
		long count = 1;

		dp[0] = 1;

		for (int i = 1; i < len; i++) {
			if (nums[i] != nums[i - 1]) {

				dp[i] = dp[i - 1] + 1;
			} else {

				dp[i] = 1;
			}
			count += dp[i];
		}

		return count;
	}
}
