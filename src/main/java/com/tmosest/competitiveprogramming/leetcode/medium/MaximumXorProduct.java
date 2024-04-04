package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumXorProduct {
	/**
	 * https://leetcode.com/problems/maximum-xor-product/description/
	 * 
	 * @param a
	 * @param b
	 * @param n
	 * @return
	 */
	public int maximumXorProduct(long a, long b, int n) {

		// Start creating what the numbers should be after xor
		long tempa = a;
		long tempb = b;

		// clear the last n bits
		long mask = ((1L << n) - 1);
		tempa = (tempa & ~mask);
		tempb = (tempb & ~mask);

		for (int i = n - 1; i >= 0; --i) {

			// if the bit at ith position is same in a and b
			// we can achieve setting the ith bit in both numbers as 1
			// For example - if both bits are 0, the bit in x can be 1
			// if both bits in and b are 1, then x can be 0
			if (((a >> i) & 1) == ((b >> i) & 1)) {
				tempa = ((tempa) | (1L << i));
				tempb = ((tempb) | (1L << i));

			} else {
				// if bits are different

				// since tempa has more higher bits set than tempb
				// setting the ith bit in b would contribute more towards the product
				if (tempa > tempb) {
					tempb = ((tempb) | (1L << i));
				} else {
					// since tempb has more higher bits set than tempa
					// setting the ith bit in a would contribute more towards the product
					tempa = ((tempa) | (1L << i));
				}
			}
		}
		int MOD = 1_000_000_007;
		long finalans = ((tempa % MOD) * (tempb % MOD)) % MOD;
		return (int) finalans;
	}
}
