package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

class ApplyOperationsOnArrayToMaximizeSumOfSquares {
	/**
	 * https://leetcode.com/problems/apply-operations-on-array-to-maximize-sum-of-squares/description/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int maxSum(List<Integer> nums, int k) {
		int[] count = new int[32];
		for (int n : nums) {
			for (int i = 0; i < 32; i++) {
				count[i] += ((n & 1 << i) > 0) ? 1 : 0;
			}
		}
		int[] arr = new int[k];
		for (int i = 0; i < 32; i++) {
			int j = 0;
			while (j < k && count[i] > 0) {
				arr[j] = arr[j] | (1 << i);
				j++;
				count[i]--;
			}
		}
		long res = 0;
		int MOD = 1000000007;
		for (int i = 0; i < k; i++) {
			long sq = ((long) arr[i] * arr[i]) % MOD;
			res = (res + sq) % MOD;
		}
		return (int) res;
	}
}
