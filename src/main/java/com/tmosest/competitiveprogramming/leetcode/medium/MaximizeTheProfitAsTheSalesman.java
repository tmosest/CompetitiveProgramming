package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Collections;
import java.util.List;

class MaximizeTheProfitAsTheSalesman {
	/**
	 * https://leetcode.com/problems/maximize-the-profit-as-the-salesman/
	 * 
	 * @param n
	 * @param offers
	 * @return
	 */
	public int maximizeTheProfit(int n, List<List<Integer>> offers) {
		Collections.sort(offers, (a, b) -> a.get(1).compareTo(b.get(1)));

		int[] ans = new int[n];
		int curr = 0;

		for (int i = 0; i < n; i++) {
			ans[i] = (i > 0) ? ans[i - 1] : 0;// for calculating max and negating 0 index

			// traversing the offers
			while (curr < offers.size() && offers.get(curr).get(1) == i) {
				int start = offers.get(curr).get(0);
				int gold = offers.get(curr).get(2);

				ans[i] = Math.max(ans[i], (start > 0 ? ans[start - 1] : 0) + gold);
				curr++;
			}
		}
		return ans[n - 1];// returning max value
	}
}
