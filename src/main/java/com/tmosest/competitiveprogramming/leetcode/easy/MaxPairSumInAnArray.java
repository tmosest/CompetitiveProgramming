package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Set;

class MaxPairSumInAnArray {
	/**
	 * https://leetcode.com/problems/max-pair-sum-in-an-array/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int maxSum(int[] nums) {
		int[] ints = new int[10];
		int max = -1;
		for (int num : nums) {
			int temp = num;
			int maxDigit = 0;
			while (temp > 0) {
				maxDigit = Math.max(maxDigit, temp % 10);
				temp /= 10;
			}
			int anInt = ints[maxDigit];
			if (anInt == 0) {
				ints[maxDigit] = num;
			} else {
				max = Math.max(max, ints[maxDigit] + num);
				ints[maxDigit] = Math.max(ints[maxDigit], num);
			}

		}
		return max;
	}
}
