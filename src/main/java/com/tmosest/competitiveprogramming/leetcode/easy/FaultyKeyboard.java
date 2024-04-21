package com.tmosest.competitiveprogramming.leetcode.easy;

class FaultyKeyboard {
	/**
	 * https://leetcode.com/problems/faulty-keyboard/description/
	 * 
	 * @param s
	 * @return
	 */
	public String finalString(String s) {
		StringBuilder stringBuilder = new StringBuilder();

		for (char letter : s.toCharArray()) {
			if (letter == 'i') {
				stringBuilder.reverse();
				continue;
			}
			stringBuilder.append(letter);
		}

		return stringBuilder.toString();
	}
}
