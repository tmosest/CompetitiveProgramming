package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class MinimumNumberOfPushesToTypeWordOne {
	/**
	 * https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/description/
	 * Better approach. O(1) because all letters are distinct we do not need to loop
	 * through them.
	 * That is why that is important to know.
	 * 
	 * @param word
	 * @return
	 */
	public int minimumPushes(String word) {
		int len = word.length();
		if (len <= 8)
			return len;
		if (len <= 16)
			return (len - 8) * 2 + 8;
		if (len <= 24)
			return (len - 16) * 3 + 8 * 2 + 8;
		return (len - 24) * 4 + 8 * 3 + 8 * 2 + 8;
	}

	/**
	 * https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/description/
	 * O(n) time approach. I missed the requirement that they are all distinct.
	 * 
	 * @param word
	 * @return
	 */
	public int minimumPushesLinear(String word) {

		int[] counts = new int[26];

		for (Character letter : word.toCharArray()) {
			counts[letter - 'a']++;
		}

		Arrays.sort(counts);

		int result = 0;
		int multiplier = 0;

		for (int i = 0; i < counts.length; i++) {
			int count = counts[counts.length - 1 - i]; // 1
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
