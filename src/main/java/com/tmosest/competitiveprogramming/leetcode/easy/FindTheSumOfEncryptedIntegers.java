package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class FindTheSumOfEncryptedIntegers {
	/**
	 * https://leetcode.com/contest/biweekly-contest-126/problems/find-the-sum-of-encrypted-integers/
	 * 
	 * @param nums
	 * @return
	 */
	public int sumOfEncryptedInt(int[] nums) {
		return Arrays.stream(nums).map(this::encrypt).reduce(0, Integer::sum);
	}

	private int encrypt(int num) {
		String s = String.valueOf(num);
		int max = 0;

		for (char l : s.toCharArray()) {
			max = Math.max(l - '0', max);
		}

		StringBuilder stringBuilder = new StringBuilder();

		for (char l : s.toCharArray()) {
			stringBuilder.append(max);
		}

		return Integer.parseInt(stringBuilder.toString());
	}
}
