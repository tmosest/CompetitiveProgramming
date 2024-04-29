package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfBeautifulPairs {
	/**
	 * https://leetcode.com/problems/number-of-beautiful-pairs/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int countBeautifulPairs(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int firstDigit = getFirstDigit(nums[i]);
			for (int j = i + 1; j < nums.length; j++) {
				int lastDigit = getLastDigit(nums[j]);
				if (findGCD(firstDigit, lastDigit) == 1) {
					count++;
				}
			}
		}
		return count;
	}

	private int getFirstDigit(int number) {
		int num = Math.abs(number);
		String numStr = Integer.toString(num);
		char firstChar = numStr.charAt(0);
		return Character.getNumericValue(firstChar);
	}

	private int getLastDigit(int number) {
		int num = Math.abs(number);
		int lastDigit = num % 10;
		return lastDigit;
	}

	private int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
