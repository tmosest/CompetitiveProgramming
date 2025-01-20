package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class FindCommonCharacters {
	/**
	 * Given a string array words, return an array of all characters that show up in
	 * all strings within the words (including duplicates).
	 * You may return the answer in any order.
	 * 
	 * @param words Array of words to look through.
	 * @return List of common characters.
	 */
	public List<String> commonChars(String[] words) {
		
		int[] characterCount = new int[26];

		String str = words[0];

		for (char letter : str.toCharArray()) {
			characterCount[letter - 'a']++;
		}

		for (String s : words) {
			int[] localCount = new int[26];
			
			for (char letter : s.toCharArray()) {
				localCount[letter - 'a']++;
			}

			for (int i = 0; i < localCount.length; i++) {
				characterCount[i] = Math.min(characterCount[i], localCount[i]);
			}
		}

		List<String> result = new ArrayList<>();

		for (int i = 0; i < characterCount.length; i++) {
			char letter = (char) ('a' + i);
			for (int c = 0; c < characterCount[i]; c++) {
				result.add(new StringBuilder().append(letter).toString());
			}
		}

		return result;
	}
}
