package com.tmosest.competitiveprogramming.leetcode;

import java.math.BigInteger;

import com.tmosest.numberwang.numbertheory.Prime;

class LargestPrimeFactor {

	public long largestPrimeFactor(long num) {
		return Prime.largestPrimeFactor(BigInteger.valueOf(num)).prime.longValue();
	}
}
