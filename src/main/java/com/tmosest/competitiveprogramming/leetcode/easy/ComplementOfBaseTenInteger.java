package com.tmosest.competitiveprogramming.leetcode.easy;

class ComplementOfBaseTenInteger {
	/**
	 * The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
	 * 
	 * For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
	 * 
	 * @param n the number to find the complement of.
	 * @return return its complement.
	 */
	public int bitwiseComplement(int n) {
		if (n == 0) {
			return 1;
		}
		
		int complement = 0;

		int power = 1;
		while (n > 0) {
			int digit = n % 2;
			if (digit == 0) {
				digit = 1;
			} else {
				digit = 0;
			}
			complement += power * digit;
			power *= 2;
			n /= 2;
		}

		return complement;
	}
}
