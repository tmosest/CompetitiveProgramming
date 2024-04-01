package com.tmosest.competitiveprogramming.leetcode.easy;

class LengthOfLastWord {
	/**
	 * https://leetcode.com/problems/length-of-last-word/description/
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLastWord(String s) {
		char[] letters = s.toCharArray();
		int result = 0;
		for (int i = 0; i < letters.length; i++) {
			char letter = letters[letters.length - i - 1];
			if (letter == ' ' && result == 0) {
				continue;
			}
			if (letter == ' ') {
				break;
			}
			++result;
		}
		return result;
	}
}
