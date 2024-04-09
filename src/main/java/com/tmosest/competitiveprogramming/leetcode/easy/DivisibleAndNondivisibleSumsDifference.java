package com.tmosest.competitiveprogramming.leetcode.easy;

class DivisibleAndNondivisibleSumsDifference {
	/**
	 * https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public int differenceOfSums(int n, int m) {
		int sumNotDiv = 0;
		int sumDiv = 0;

		for (int i = 1; i <= n; i++) {
			if (i % m == 0) {
				sumDiv += i;
			} else {
				sumNotDiv += i;
			}
		}

		return sumNotDiv - sumDiv;
	}
}
