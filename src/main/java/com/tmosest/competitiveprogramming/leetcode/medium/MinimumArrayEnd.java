package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumArrayEnd {
	/**
	 * https://leetcode.com/problems/minimum-array-end/description/
	 * 
	 * Solution: https://leetcode.com/problems/minimum-array-end/solutions/5081977/java-easy-math-solution/
	 * 
	 * @param n
	 * @param x
	 * @return
	 */
	public long minEnd(long n, long x) {
        if (n == 1) {
            return x;
        }
        n--;
        long j = 0;
        for (long i = 0; i < 64; i++) {
            long bit = (x >> i) & 1L;
            if (bit == 0) {
                // can place
                long nbit = (n >> j) & 1L;
                if (nbit == 1) {
                    x |= (1L << i);
                }
                j++;
            }
        }
        return x;
    }
}
