package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class MinimumSizeSubarrayInInfiniteArray {
	/**
	 * https://leetcode.com/problems/minimum-size-subarray-in-infinite-array/description/
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int minSizeSubarray(int[] A, int target) {
		long sumA = 0L;
		long su = 0L;

		for (int a : A) {
			sumA += a;
		}
		int n = A.length, k = (int) (target / sumA), res = n;
		target %= sumA;
		if (target == 0) {
			return k * n;
		}

		Map<Long, Integer> dp = new HashMap<>();
		dp.put(0L, -1);

		for (int i = 0; i < 2 * n; ++i) {
			su += A[i % n];
			if (dp.containsKey(su - target)) {
				res = Math.min(res, i - dp.get(su - target));
			}
			dp.put(su, i);
		}

		return res < n ? res + k * n : -1;
	}
}
