package com.tmosest.competitiveprogramming.leetcode.easy;

class CountTheNumberOfSpecialCharactersOne {
	/**
	 * https://leetcode.com/problems/count-the-number-of-special-characters-i/description/
	 * 
	 * @param word
	 * @return
	 */
	public int numberOfSpecialChars(String word) {
		
		int[] upperCount = new int[26];
		int[] lowerCount = new int[26];

		for (char letter : word.toCharArray()) {
			if (letter >= 'A' && letter <= 'Z') {
				upperCount[letter - 'A']++;
				continue;
			}
			lowerCount[letter - 'a']++;
		}

		int count = 0;

		for (int i = 0; i < upperCount.length; i++) {
			if (upperCount[i] > 0 && lowerCount[i] > 0) {
				++count;
			}
		}

		return count;
	}
}
