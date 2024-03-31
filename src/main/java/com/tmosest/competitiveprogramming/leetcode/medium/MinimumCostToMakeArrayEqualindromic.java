package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumCostToMakeArrayEqualindromic {
	/**
	 * https://leetcode.com/problems/minimum-cost-to-make-array-equalindromic/description/
	 * 
	 * @param nums
	 * @return
	 */
	public long minimumCost(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		int middle = nums[n / 2];
		int inc = middle;
		int dec = middle;

		while (!isPal(inc))
			inc++;
		while (!isPal(dec))
			dec--;

		return Math.min(calculateCost(nums, inc), calculateCost(nums, dec));
	}

	public boolean isPal(int n) {
		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		return temp == sum;
	}

	public long calculateCost(int[] nums, int r) {
		long cost = 0;
		for (int n : nums)
			cost += Math.abs(n - r);
		return cost;
	}
}
