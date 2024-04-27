package com.tmosest.competitiveprogramming.leetcode.easy;

class SumOfSquaresOfSpecialElements {
	/**
	 * https://leetcode.com/problems/sum-of-squares-of-special-elements/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int sumOfSquares(int[] nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums.length % (i + 1) == 0) {
				sum += nums[i] * nums[i];
			}
		}
		
		return sum;
	}
}
