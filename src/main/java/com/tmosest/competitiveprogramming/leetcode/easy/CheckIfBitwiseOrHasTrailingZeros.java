package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class CheckIfBitwiseOrHasTrailingZeros {
	/**
	 * https://leetcode.com/problems/check-if-bitwise-or-has-trailing-zeros/
	 * 
	 * @param nums
	 * @return
	 */
	public boolean hasTrailingZeros(int[] nums) {
		return Arrays.stream(nums).filter(num -> num % 2 == 0).count() > 1;
	}
}
