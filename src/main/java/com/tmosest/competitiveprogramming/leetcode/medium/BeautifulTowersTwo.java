package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayDeque;
import java.util.List;

class BeautifulTowersTwo {
	/**
	 * https://leetcode.com/problems/beautiful-towers-ii/description/
	 * 
	 * @param maxHeights
	 * @return
	 */
	public long maximumSumOfHeights(List<Integer> maxHeights) {
		int n = maxHeights.size();
		int[] nextMaxSmaller = new int[n];
		nextMaxSmaller[n - 1] = n - 1;
		ArrayDeque<Integer> stk = new ArrayDeque<>();
		stk.push(n - 1);
		for (int i = n - 2; i >= 0; i--) {
			while (!stk.isEmpty() && maxHeights.get(stk.peek()) >= maxHeights.get(i)) {
				stk.pop();
			}
			nextMaxSmaller[i] = stk.isEmpty() ? i : stk.peek();
			stk.push(i);
		}
		stk.clear();

		int[] prevMaxSmaller = new int[n];
		prevMaxSmaller[0] = 0;
		stk.push(0);
		for (int i = 1; i < n; i++) {
			while (!stk.isEmpty() && maxHeights.get(stk.peek()) >= maxHeights.get(i)) {
				stk.pop();
			}
			prevMaxSmaller[i] = stk.isEmpty() ? i : stk.peek();
			stk.push(i);
		}

		long[] rsum = new long[n];
		rsum[n - 1] = maxHeights.get(n - 1);
		for (int i = n - 2; i >= 0; i--) {
			long sum = maxHeights.get(i);
			int j = nextMaxSmaller[i];
			if (j == i) {
				rsum[i] = (n - i) * sum;
			} else {
				rsum[i] = (j - i) * sum + rsum[j];
			}

		}

		long[] lsum = new long[n];
		lsum[0] = maxHeights.get(0);
		for (int i = 1; i < n; i++) {
			long sum = maxHeights.get(i);
			int j = prevMaxSmaller[i];
			if (j == i) {
				lsum[i] = (i + 1) * sum;
			} else {
				lsum[i] = (i - j) * sum + lsum[j];
			}
		}

		long res = 0;
		for (int p = 0; p < n; p++) {
			long currSum = rsum[p] + lsum[p] - maxHeights.get(p);
			res = Math.max(currSum, res);
		}
		return res;

	}
}
