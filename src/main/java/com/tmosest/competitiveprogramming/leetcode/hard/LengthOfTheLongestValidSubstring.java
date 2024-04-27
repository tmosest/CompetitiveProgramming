package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class LengthOfTheLongestValidSubstring {
	/**
	 * https://leetcode.com/problems/length-of-the-longest-valid-substring/description/
	 * 
	 * @param word
	 * @param forbidden
	 * @return
	 */
	public int longestValidSubstring(String word, List<String> forbidden) {
		Set<String> set = new HashSet<>();

		for (String s : forbidden)
			set.add(s);

		int ans = 0;
		int i = 0;
		int j = 0;

		while (j < word.length()) {
			for (int k = j; k > j - 10 && k >= i; k--) {
				if (set.contains(word.substring(k, j + 1))) {
					i = k + 1;
					break;
				}
			}
			ans = Math.max(j - i + 1, ans);
			j++;
		}
		return ans;
	}
}
