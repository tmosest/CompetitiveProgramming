package com.tmosest.competitiveprogramming.leetcode.easy;

class MakeThreeStringsEqual {
	/**
	 * https://leetcode.com/problems/make-three-strings-equal/description/
	 * 
	 * @param s1
	 * @param s2
	 * @param s3
	 * @return
	 */
	public int findMinimumOperations(String s1, String s2, String s3) {
        int i = 0, n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
        while (i < Math.min(n1, Math.min(n2, n3))) {
            if (s1.charAt(i) != s2.charAt(i) || s1.charAt(i) != s3.charAt(i)) {
                break;
            }
            ++i;
        }
        return i == 0 ? - 1 : n1 - i + n2 - i  + n3 - i;
    }
}
