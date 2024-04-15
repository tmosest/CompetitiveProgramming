package com.tmosest.competitiveprogramming.leetcode.easy;

class CountSymmetricIntegers {
	/**
	 * https://leetcode.com/problems/count-symmetric-integers/
	 * 
	 * @param low
	 * @param high
	 * @return
	 */
	public int countSymmetricIntegers(int low, int high) {
		int count = 0;

		for (int i = low; i <= high; i++) {
			if (isSymmetric(i)) {
				++count;
			}
		}

		return count;
	}

	private boolean isSymmetric(int num) {
		char[] nums = String.valueOf(num).toCharArray();

		if (nums.length % 2 == 1) {
			return false;
		}

		int first = 0;

		for (int i = 0; i < nums.length / 2; i++) {
			first += nums[i] - '0';
		}

		int sec = 0;

		for (int i = nums.length / 2; i < nums.length; i++) {
			sec += nums[i] - '0';
		}

		return sec == first;
	}
}
