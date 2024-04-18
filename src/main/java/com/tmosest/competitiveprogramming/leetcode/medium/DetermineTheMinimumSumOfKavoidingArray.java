package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class DetermineTheMinimumSumOfKavoidingArray {
	/**
	 * https://leetcode.com/problems/determine-the-minimum-sum-of-a-k-avoiding-array/description/
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	public int minimumSum(int n, int k) {
		int ans = 0;
		Set<Integer> s = new HashSet<>();
		int f = 1;
		int sz = 0;
		while (sz < n) {
			if (!s.contains(k - f)) {
				ans += f;
				sz++;
				s.add(f);
			}
			f++;
		}
		return ans;
	}
}
