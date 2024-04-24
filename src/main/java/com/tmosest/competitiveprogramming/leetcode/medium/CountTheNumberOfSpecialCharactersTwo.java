package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class CountTheNumberOfSpecialCharactersTwo {
	/**
	 * https://leetcode.com/problems/count-the-number-of-special-characters-ii/description/
	 * 
	 * A letter c is called special if it appears both in lowercase and uppercase in word, 
	 * and every lowercase occurrence of c appears before the first uppercase occurrence of c.
	 * 
	 * This could also be done with arrays instead like part 1 and be faster.
	 * 
	 * Just instead of storing count we store the position.
	 * 
	 * 
	 * @param word
	 * @return
	 */
	public int numberOfSpecialChars(String word) {

		Map<Character, Integer> firstUpper = new HashMap<>();
		Map<Character, Integer> lastDowner = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if (letter >= 'A' && letter <= 'Z') {
				int pos = firstUpper.getOrDefault(letter, Integer.MAX_VALUE);
				firstUpper.put(letter, Math.min(pos, i));
				continue;
			}
			int pos = lastDowner.getOrDefault(letter, 0);
			lastDowner.put(letter, Math.max(pos, i));
		}

		int count = 0;

		for (char letter : lastDowner.keySet()) {
			char upper = (char) (letter - 'a' + 'A');
			if (!firstUpper.containsKey(upper)) {
				continue;
			}
			if (lastDowner.get(letter) < firstUpper.get(upper)) {
				++count;
			}
		}

		return count;
	}
}
