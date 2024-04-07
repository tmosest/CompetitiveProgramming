package com.tmosest.competitiveprogramming.leetcode.easy;

class MinimumSumOfMountainTripletsOne {
	/**
	 * https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int minimumSum(int[] nums) {
		int n = nums.length;
		int[] prefixmin = new int[n];
		int[] suffixmin = new int[n];
		int minsofar = nums[0];
		prefixmin[0] = nums[0];
		for (int i = 1; i < n; i++) {
			minsofar = Math.min(minsofar, nums[i]);
			prefixmin[i] = minsofar;
		}
		minsofar = nums[n - 1];
		suffixmin[n - 1] = nums[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			minsofar = Math.min(minsofar, nums[i]);
			suffixmin[i] = minsofar;
		}
		int ans = Integer.MAX_VALUE;
		int flag = 0;
		for (int i = 1; i < n - 1; i++) {
			if (prefixmin[i - 1] < nums[i] && suffixmin[i + 1] < nums[i]) {
				ans = Math.min(prefixmin[i - 1] + nums[i] + suffixmin[i + 1], ans);
				flag = 1;
			}
		}
		if (flag == 0)
			return -1;
		return ans;
	}
}
