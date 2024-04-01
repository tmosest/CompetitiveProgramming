package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class MaximumLengthSubstringWithTwoOccurrences {
	/**
	 * https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/
	 * 
	 * @param s
	 * @return
	 */
	public int maximumLengthSubstring(String s) {
		
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				if (containsLessThanTwoRepeats(sub)) {
					maxLength = Math.max(maxLength, sub.length());
				}
			}
		}

		return maxLength;
	}

	private boolean containsLessThanTwoRepeats(String sub) {
		char[] counts = new char[26];

		for (char letter : sub.toCharArray()) {
			++counts[letter - 'a'];
			if (counts[letter - 'a'] > 2) {
				return false;
			}
		}

		return true;
	}
}
