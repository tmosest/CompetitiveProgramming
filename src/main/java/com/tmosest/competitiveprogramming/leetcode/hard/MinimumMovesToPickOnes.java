package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

class MinimumMovesToPickOnes {
	/**
	 * https://leetcode.com/contest/weekly-contest-389/problems/minimum-moves-to-pick-k-ones/
	 * 
	 * @param nums
	 * @param k
	 * @param maxChanges
	 * @return
	 */
	public long minimumMoves(int[] nums, int k, int maxChanges) {
		List<Long> A = new ArrayList<>();
		A.add(0L);
		for (int i = 0; i < nums.length; i++)
			if (nums[i] > 0)
				A.add(A.get(A.size() - 1) + i);

		int n = A.size() - 1, m = Math.max(0, k - maxChanges);
		long res = Long.MAX_VALUE;
		for (int l = m; l <= Math.min(n, Math.min(m + 3, k)); l++) {
			for (int i = 0; i <= n - l; i++) {
				int mid1 = i + l / 2, mid2 = i + l - l / 2;
				long cur = A.get(i + l) - A.get(mid2) - (A.get(mid1) - A.get(i));
				res = Math.min(res, cur + (k - l) * 2);
			}
		}
		return res;
	}
}
