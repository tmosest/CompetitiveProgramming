package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MaximumPrimeDifference {
	/**
	 * https://leetcode.com/problems/maximum-prime-difference/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int maximumPrimeDifference(int[] nums) {
		
		boolean[] seive = seive(100);

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			if (seive[nums[left]] && seive[nums[right]]) {
				break;
			}
			if (!seive[nums[left]]) {
				left++;
			}
			if (!seive[nums[right]]) {
				right--;
			}
		}

		return right - left;
	}

	private boolean[] seive(int max) {
		boolean[] seive = new boolean[max + 1];
		Arrays.fill(seive, true);

		seive[0] = false;
		seive[1] = false;

		for (int i = 2; i * i < seive.length; i++) {
			for (int j = 2; i * j < seive.length; j++) {
				seive[i * j] = false;
			}
		}

		return seive;
	}
}
