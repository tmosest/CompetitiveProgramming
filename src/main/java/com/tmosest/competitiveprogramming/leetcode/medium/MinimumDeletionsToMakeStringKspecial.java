package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumDeletionsToMakeStringKspecial {
	/**
	 * https://leetcode.com/contest/weekly-contest-389/problems/minimum-deletions-to-make-string-k-special/
	 * 
	 * @param word
	 * @param k
	 * @return
	 */
	public int minimumDeletions(String word, int k) {
		int[] freq = new int[26];
		for (char ch : word.toCharArray()) {
			freq[ch - 'a']++;
		}

		Arrays.sort(freq);
		int minDel = Integer.MAX_VALUE;

		for (int i = freq.length - 1; i >= 0; i--) {
			int trgt = freq[i];
			int dels = 0;

			for (int f : freq) {
				if (f > trgt + k) {
					dels += f - (trgt + k);
				} else if (f < trgt) {
					dels += f;
				}
			}

			minDel = Math.min(minDel, dels);
			if (minDel == 0) {
				break;
			}
		}

		return minDel == Integer.MAX_VALUE ? 0 : minDel;
	}
}
