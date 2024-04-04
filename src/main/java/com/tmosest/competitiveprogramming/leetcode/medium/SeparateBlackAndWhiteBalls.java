package com.tmosest.competitiveprogramming.leetcode.medium;

class SeparateBlackAndWhiteBalls {
	/**
	 * https://leetcode.com/problems/separate-black-and-white-balls/description/
	 * 
	 * @param s
	 * @return
	 */
	public long minimumSteps(String s) {
		long zero = 0;
		long res = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				res += zero;
			} else {
				zero += 1;
			}
		}
		return res;
	}
}
