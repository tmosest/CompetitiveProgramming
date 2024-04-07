package com.tmosest.competitiveprogramming.leetcode.easy;

class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
	/**
	 * https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int longestMonotonicSubarray(int[] nums) {
		int longestIncreasing = 1;
        int count = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                ++count;
                longestIncreasing = Math.max(longestIncreasing, count);
                continue;
            }
            count = 1;
        }
        
        int longestDecreasng = 1;
        count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                ++count;
                longestDecreasng = Math.max(longestDecreasng, count);
                continue;
            }
            count = 1;
        }
        return Math.max(longestDecreasng, longestIncreasing);
	}
}
