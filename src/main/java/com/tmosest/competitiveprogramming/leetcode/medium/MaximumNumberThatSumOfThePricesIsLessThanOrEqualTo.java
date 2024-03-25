package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumNumberThatSumOfThePricesIsLessThanOrEqualTo {
	/**
	 * https://leetcode.com/problems/maximum-number-that-sum-of-the-prices-is-less-than-or-equal-to-k/
	 * https://leetcode.com/problems/maximum-number-that-sum-of-the-prices-is-less-than-or-equal-to-k/solutions/4563919/binary-search-easy-and-simple-kiss-approach/
	 * 
	 * @param k
	 * @param x
	 * @return
	 */
	public long findMaximumNumber(long k, int x) {
		long res = 0;
		long low = 1, hi = (long) 1e15;
		// isSafe(9, k, x);
		while (low <= hi) {
			long mid = low + (hi - low) / 2;
			if (isSafe(mid, k, x)) {
				// System.out.println(mid);
				res = mid;
				low = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return res;
	}

	private boolean isSafe(long num, long k, int x) {
		int i = 0;
		long res = 0;
		long tmp = num;
		while (num > 0) {
			num /= 2;
			if ((i + 1) % x == 0) {
				// System.out.println(i+" "+getNumSetBit(tmp, 1<<i));
				res += getNumSetBit(tmp, 1L << i);
			}
			i++;
		}
		return res <= k;
	}

	private long getNumSetBit(long num, long i) {
		long group = (num + 1) / i;
		return i * (group / 2) + ((group % 2 == 1) ? (num + 1) % i : 0);
	}
}
