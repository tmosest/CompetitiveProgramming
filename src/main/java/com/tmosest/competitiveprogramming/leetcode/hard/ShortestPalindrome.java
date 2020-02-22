package com.tmosest.competitiveprogramming.leetcode.hard;

class ShortestPalindrome {

	String shortestPalindrome(String str) {
		char[] letters = str.toCharArray();

		// if it's already a palindrome we are good to go.
		int offset;

		for (offset = 1; offset <= letters.length - 1; offset++) {
			boolean isPalindrome = true;
			for (int i = 0; i <= (letters.length - offset) / 2; i++) {
				if (letters[i] != letters[letters.length - offset - i]) {
					isPalindrome = false;
					break;
				}
			}
			if (isPalindrome) {
				break;
			}
		}

		if (offset == 1) {
			return str;
		}

		StringBuilder stringBuilder = new StringBuilder(str);
		for (int j = letters.length - offset + 1; j < letters.length; j++) {
			stringBuilder.insert(0, letters[j]);
		}

		return stringBuilder.toString();
	}
}
