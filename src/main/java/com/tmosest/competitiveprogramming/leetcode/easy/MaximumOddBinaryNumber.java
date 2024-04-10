package com.tmosest.competitiveprogramming.leetcode.easy;

class MaximumOddBinaryNumber {
	/**
	 * https://leetcode.com/problems/maximum-odd-binary-number/
	 * 
	 * @param s
	 * @return
	 */
	public String maximumOddBinaryNumber(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		StringBuilder res = new StringBuilder();
		if (count == 0) {
			return "";
		}
		for (int i = 1; i < count; i++) {
			res.append(1);
		}
		for (int i = count; i < s.length(); i++) {
			res.append(0);
		}
		res.append(1);
		return res.toString();
	}
}
