package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class BinaryPrefixDivisibleByFive {
	/**
	 * You are given a binary array nums (0-indexed).
	 * 
	 * We define xi as the number whose binary representation is the subarray
	 * nums[0..i] (from most-significant-bit to least-significant-bit).
	 * 
	 * For example, if nums = [1,0,1], then x0 = 1, x1 = 2, and x2 = 5.
	 * 
	 * Return an array of booleans answer where answer[i] is true if xi is divisible
	 * by 5.
	 * 
	 * @param nums Array representation of binary numbers
	 * @return List where each entry is true if we can divide that number by 5.
	 */
	public List<Boolean> prefixesDivBy5(int[] nums) {

		List<Boolean> list = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = (sum * 2 + nums[i]) % 5;
			if (sum != 0) {
				list.add(false);
			} else {
				list.add(true);
			}
		}
		return list;
	}
}
