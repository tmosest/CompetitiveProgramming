package com.tmosest.competitiveprogramming.leetcode.medium;

class CountSubstringsStartingAndEndingWithGivenCharacter {
	/**
	 * https://leetcode.com/contest/weekly-contest-389/problems/count-substrings-starting-and-ending-with-given-character/
	 * Uses triangle numbers! For greedy solution.
	 * 
	 * @param s
	 * @param c
	 * @return
	 */
	public long countSubstrings(String s, char c) {
		long result = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				result++;
			}
		}

		return (result * (result + 1)) / 2;
	}

	public long countSubstringsSlow(String s, char c) {
		long result = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != c) {
				continue;
			}
			for (int j = i; j < s.length(); j++) {
				if (j >= s.length()) {
					continue;
				}
				if (s.charAt(j) != c) {
					continue;
				}
				result++;
			}
		}

		return result;
	}
}
