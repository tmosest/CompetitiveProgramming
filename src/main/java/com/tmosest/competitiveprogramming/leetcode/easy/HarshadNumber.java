package com.tmosest.competitiveprogramming.leetcode.easy;

class HarshadNumber {
	/**
	 * https://leetcode.com/problems/harshad-number/
	 * @param x
	 * @return
	 */
	public int sumOfTheDigitsOfHarshadNumber(int num) {
		int sum = sumDigits(num);
		return num % sum == 0 ? sum : -1;
	}

	private int sumDigits(int num) {
		int result = 0;

		while (num > 0) {
			result += num % 10;
			num /= 10;
		}

		return result;
	}
}
