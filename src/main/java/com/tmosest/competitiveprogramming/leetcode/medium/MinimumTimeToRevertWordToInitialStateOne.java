package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumTimeToRevertWordToInitialStateOne {
	/**
	 * https://leetcode.com/problems/minimum-time-to-revert-word-to-initial-state-i/description/
	 * 
	 * @param word
	 * @param k
	 * @return
	 */
	public int minimumTimeToInitialState(String word, int k) {

		int res = 0;
		String copy = new String(word);

		do {
			res++;
			if (copy.length() < k)
				return res;
			copy = copy.substring(k);
		} while (!check(copy, word));

		return res;

	}

	private static boolean check(String copy, String word) {

		int m = copy.length(), n = word.length();
		for (int i = 0; i < m; i++) {
			if (copy.charAt(i) != word.charAt(i))
				return false;
		}
		return true;
	}
}
