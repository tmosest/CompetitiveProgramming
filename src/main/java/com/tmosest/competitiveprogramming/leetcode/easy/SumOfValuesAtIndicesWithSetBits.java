package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;

class SumOfValuesAtIndicesWithSetBits {
	/**
	 * https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
		int sum = 0;

		for (int i = 0; i < nums.size(); i++) {
			if (Integer.bitCount(i) == k) {
				sum += nums.get(i);
			}
		}

		return sum;
	}
}
