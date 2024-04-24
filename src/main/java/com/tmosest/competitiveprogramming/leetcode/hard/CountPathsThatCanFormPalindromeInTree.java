package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CountPathsThatCanFormPalindromeInTree {
	/**
	 * https://leetcode.com/problems/count-paths-that-can-form-a-palindrome-in-a-tree/description/
	 * 
	 * https://leetcode.com/problems/count-paths-that-can-form-a-palindrome-in-a-tree/solutions/3803762/java-c-python-bit-mask/
	 * 
	 * @param parent
	 * @param s
	 * @return
	 */
	public long countPalindromePaths(List<Integer> parent, String s) {
		int n = parent.size(), dp[] = new int[n];
		long res = 0;
		Map<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int mask = f(dp, parent, s, i), v = count.getOrDefault(mask, 0);
			for (int j = 0; j < 26; j++)
				res += count.getOrDefault(mask ^ (1 << j), 0);
			res += v;
			count.put(mask, v + 1);
		}
		return res;
	}

	private int f(int[] dp, List<Integer> parent, String s, int i) {
		if (i > 0 && dp[i] == 0)
			dp[i] = f(dp, parent, s, parent.get(i)) ^ (1 << (s.charAt(i) - 'a'));
		return dp[i];
	}
}
