package com.tmosest.competitiveprogramming.leetcode.easy;

public class CountPrefixAndSuffixPairsOne {
	/**
	 * https://leetcode.com/contest/weekly-contest-385/problems/count-prefix-and-suffix-pairs-i/
	 */
	public int countPrefixSuffixPairs(String[] words) {
		int count = 0;
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (isPrefixAndSuffix(words[i], words[j])) {
					++count;
				}
			}
		}
		return count;
	}

	private boolean isPrefixAndSuffix(String str1, String str2) {
		if (str1.length() > str2.length())
			return false;
		String prefix = str2.substring(0, str1.length());
		String suffix = str2.substring(str2.length() - str1.length(), str2.length());
		return prefix.equals(str1) && suffix.equals(str1);
	}
}
