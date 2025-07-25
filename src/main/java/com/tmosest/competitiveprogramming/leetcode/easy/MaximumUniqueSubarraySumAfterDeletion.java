package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class MaximumUniqueSubarraySumAfterDeletion {

	public int maxSum(int[] nums) {

		Set<Integer> set = new HashSet<>();

		int max = Integer.MIN_VALUE;

		for (int num : nums) {
			set.add(num);
			max = Math.max(max, num);
		}

		if (max < 0)
			return max;

		int sum = 0;

		for (int num : set) {
			if (num > 0) {
				sum += num;
			}
		}

		return sum;
	}
}
