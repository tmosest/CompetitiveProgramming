package com.tmosest.competitiveprogramming.leetcode.hard;

class CountCompleteSubstrings {
	/**
	 * https://leetcode.com/problems/count-complete-substrings/
	 * 
	 * T.C : O(n*26*n) ~ O(n^2)
	 * S.C : O(26) We create an array of size 26 everytime. So assuming it constant
	 * 
	 * See Sliding Window Technique in Arrays
	 * 
	 * @param word
	 * @param k
	 * @return
	 */
	public int countCompleteSubstrings(String word, int k) {
		int n = word.length();
		int result = 0;
		int last = 0;

		for (int i = 1; i <= n; i++) {
			if (i == n || Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2) { // satisfying condition 2
				result += solve(last, i - 1, word, k); // condition 1
				last = i;
			}
		}
		return result;
	}

	private int solve(int start, int end, String word, int k) {
		int result = 0;
		for (int chars = 1; chars <= 26 && chars * k <= end - start + 1; chars++) {
			int[] count = new int[26];
			int goodChars = 0; // How many chars are of frequency k

			// Now do a sliding window
			int i = start;
			int windowLength = chars * k;
			for (int j = start; j <= end; j++) {
				char ch = word.charAt(j);

				count[ch - 'a']++;
				if (count[ch - 'a'] == k) {
					goodChars++;
				} else if (count[ch - 'a'] == k + 1) {
					goodChars--;
				}

				if (j - i + 1 > windowLength) { // Need to shift window right
					if (count[word.charAt(i) - 'a'] == k) {
						goodChars--;
					} else if (count[word.charAt(i) - 'a'] == k + 1) {
						goodChars++;
					}
					count[word.charAt(i) - 'a']--;
					i++;
				}

				if (goodChars == chars) {
					result++;
				}
			}
		}
		return result;
	}
}
