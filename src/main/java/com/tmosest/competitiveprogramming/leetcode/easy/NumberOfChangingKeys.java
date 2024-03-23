package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfChangingKeys {
	/**
	 * https://leetcode.com/problems/number-of-changing-keys/
	 * @param s
	 * @return
	 */
	public int countKeyChanges(String s) {
		int result = 0;
        char[] lower = s.toLowerCase().toCharArray();
        for (int i = 1; i < lower.length; i++) {
            char prev = lower[i - 1];
            char curr = lower[i];

            if (prev != curr) {
                ++result;
            }
        }
        return result;
	}
}
