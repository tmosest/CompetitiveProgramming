package com.tmosest.competitiveprogramming.leetcode.easy;

class ReverseOnlyLetters {
	/**
	 * Given a string s, reverse the string according to the following rules:
	 *
	 *	All the characters that are not English letters remain in the same position.
	 *	All the English letters (lowercase or uppercase) should be reversed.
	 *	Return s after reversing it.
	 *
	 * @param s string
	 * @return reversed string
	 */
	public String reverseOnlyLetters(String s) {
		
		StringBuilder reverseCharacters = new StringBuilder();

		for (char letter : s.toCharArray()) {
			if (Character.isAlphabetic(letter))
				reverseCharacters.append(letter);
		}

		reverseCharacters.reverse();

		StringBuilder res = new StringBuilder();

		int r = 0;
		for (char letter : s.toCharArray()) {
			if (Character.isAlphabetic(letter)) {
				res.append(reverseCharacters.charAt(r++));
				continue;
			}
			res.append(letter);
		}

		return res.toString();
	}
}
