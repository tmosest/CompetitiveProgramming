package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

class MaximumNumberOfAlloys {
	/**
	 * https://leetcode.com/problems/maximum-number-of-alloys/
	 * 
	 * @param n
	 * @param k
	 * @param budget
	 * @param composition
	 * @param stock
	 * @param cost
	 * @return
	 */
	public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock,
			List<Integer> cost) {
		long maxAlloys = 0l;

		for (int i = 0; i < k; i++) {
			long lo = 0l, hi = (long) 1e9;
			long ans = 0l;
			while (lo <= hi) {
				long currAlloys = lo + (hi - lo) / 2;
				long cst = 0l;
				for (int j = 0; j < n; j++) {
					long req = currAlloys * composition.get(i).get(j);
					cst += (Math.max(0, req - stock.get(j)) * cost.get(j));
					if (cst > budget)
						break;
				}
				if (cst > budget)
					hi = currAlloys - 1;
				else if (cst <= budget) {
					ans = currAlloys;
					lo = currAlloys + 1;
				}
			}
			maxAlloys = Math.max(maxAlloys, ans);
		}
		return (int) maxAlloys;
	}
}
