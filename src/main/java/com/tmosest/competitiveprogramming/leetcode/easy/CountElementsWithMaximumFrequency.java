package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class CountElementsWithMaximumFrequency {
	/**
	 * https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
	 * @param nums
	 * @return
	 */
	public int maxFrequencyElements(int[] nums) {

		int[] counts = new int[100];

		for (int num : nums) {
			counts[num - 1]++;
		}

		Arrays.sort(counts);

		int max = 0;
		int maxCount = 0;

		for (int i = 0; i < counts.length; i++) {
			max = Math.max(max, counts[counts.length - i - 1]);
			if (counts[counts.length - i - 1] == max) {
				maxCount += counts[counts.length - i - 1];
			}
		}

		return maxCount;
	}
}
