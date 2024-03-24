package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumNumberOfPushesToTypeWordTwo {
	/**
	 * https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/description/
	 * This uses O(N) time and O(1) space.
	 * 
	 * @param word
	 * @return
	 */
	public int minimumPushes(String word) {
		int[] counts = new int[26];

		for (Character letter : word.toCharArray()) {
			counts[letter - 'a']++;
		}

		Arrays.sort(counts);

		int result = 0;
		int multiplier = 0;

		for (int i = 0; i < counts.length; i++) {
			int count = counts[counts.length - 1 - i];
			if (i % 8 == 0) {
				++multiplier;
			}
			if (count == 0) {
				break;
			}
			result += multiplier * count;
		}

		return result;
	}
}
