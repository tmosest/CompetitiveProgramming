package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

class CheckIfItIsPossibleToSplitArray {
	/**
	 * https://leetcode.com/problems/check-if-it-is-possible-to-split-array/description/
	 * 
	 * @param nums
	 * @param m
	 * @return
	 */
	public boolean canSplitArray(List<Integer> nums, int m) {
		int[][] memo = new int[nums.size() + 1][nums.size() + 1];
		int totalSum = 0;
		for (int i = 0; i < nums.size(); i++) {
			totalSum += nums.get(i);
		}
		return isSplitArray(nums, 0, nums.size() - 1, m, totalSum, memo);
	}

	private static boolean isSplitPoint(int s, int e, int sum, int m) {
		return sum >= m || (e - s + 1) == 1;
	}

	private boolean isSplitArray(List<Integer> nums, int st, int e, int m, int totalSum, int[][] dp) {
		if (st == e) {
			return true;
		}
		if (dp[st][e] != 0) {
			return dp[st][e] == 1;
		}
		int curr = 0, remain = 0;
		for (int i = st; i < e; i++) {
			curr += nums.get(i);
			remain = totalSum - curr;
			boolean shouldSplit = isSplitPoint(st, i, curr, m) && isSplitPoint(i + 1, e, remain, m);
			if (shouldSplit && isSplitArray(nums, st, i, m, curr, dp) && isSplitArray(nums, i + 1, e, m, remain, dp)) {
				dp[st][e] = 1;
				return true;
			}
		}
		dp[st][e] = -1;
		return false;
	}
}
