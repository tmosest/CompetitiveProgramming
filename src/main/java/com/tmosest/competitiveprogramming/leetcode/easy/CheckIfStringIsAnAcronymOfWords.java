package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.List;

class CheckIfStringIsAnAcronymOfWords {
	/**
	 * https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
	 * 
	 * @param words
	 * @param s
	 * @return
	 */
	public boolean isAcronym(List<String> words, String s) {
		StringBuilder stringBuilder = new StringBuilder();

		for (String str : words) {
			stringBuilder.append(str.charAt(0));
		}

		return stringBuilder.toString().equals(s);
	}
}
