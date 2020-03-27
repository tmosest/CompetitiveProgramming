package com.tmosest.competitiveprogramming.leetcode.medium;

class GreatestSumDivisibleByThree {

	private int max;

	int maxSumDivThree(int[] nums) {
		max = 0;

		for (int i = 0; i < nums.length; i++) {
			maxSumDivThree(nums, i, 0);
		}

		return max;
	}

	private void maxSumDivThree(int[] nums, int index, int sum) {
		if (index >= nums.length) {
			return;
		}

		sum += nums[index];

		if (sum % 3 == 0) {
			max = Math.max(max, sum);
		}

		for (int j = index + 1; j < nums.length; j++) {
			maxSumDivThree(nums, j, sum);
		}
	}
}
