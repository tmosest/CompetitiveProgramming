package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class CountSpecialTriplets {

	public int specialTriplets(int[] A) {
		int MOD = 1_000_000_007;
		int n = A.length;
        long[] res = new long[n];
        Map<Integer, Integer> count = new HashMap<>();

        // Forward pass
        for (int i = 0; i < n; ++i) {
            res[i] = count.getOrDefault(A[i] * 2, 0);
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
        }
        count.clear();
        long total = 0;

        // Backward pass
        for (int i = n - 1; i >= 0; --i) {
            res[i] *= count.getOrDefault(A[i] * 2, 0);
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
            total = (total + res[i]) % MOD;
        }

        return (int) total;
	}
}
