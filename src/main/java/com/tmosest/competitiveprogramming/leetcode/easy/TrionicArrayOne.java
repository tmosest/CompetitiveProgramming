package com.tmosest.competitiveprogramming.leetcode.easy;

class TrionicArrayOne {
	/*
	 * https://leetcode.com/problems/trionic-array-i/description/
	 * 
	 * You are given an integer array nums of length n.
	 * 
	 * An array is trionic if there exist indices 0 < p < q < n - 1 such that:
	 * 
	 * nums[0...p] is strictly increasing,
	 * nums[p...q] is strictly decreasing,
	 * nums[q...n - 1] is strictly increasing.
	 * Return true if nums is trionic, otherwise return false.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,3,5,4,2,6]
	 * 
	 * Output: true
	 * 
	 * Explanation:
	 * 
	 * Pick p = 2, q = 4:
	 * 
	 * nums[0...2] = [1, 3, 5] is strictly increasing (1 < 3 < 5).
	 * nums[2...4] = [5, 4, 2] is strictly decreasing (5 > 4 > 2).
	 * nums[4...5] = [2, 6] is strictly increasing (2 < 6).
	 * Example 2:
	 * 
	 * Input: nums = [2,1,3]
	 * 
	 * Output: false
	 * 
	 * Explanation:
	 * 
	 * There is no way to pick p and q to form the required three segments.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 3 <= n <= 100
	 * -1000 <= nums[i] <= 1000
	 * 
	 * https://leetcode.com/problems/trionic-array-i/solutions/7038109/javacpython-
	 * one-pass-by-lee215-72cw/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7041077/trionic-array
	 * -i-by-la_castille-wnlo/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7045233/any-language-
	 * very-easy-solution-on-time-qt5rf/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7038133/java-solution
	 * -beats-100-by-2021uee1350-ybg6/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7038024/easy-solution
	 * -on3-by-ankith_kumar-t8vf/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7039140/on-optimized-
	 * trionic-detector-one-pass-p-tp6i/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7038701/three-phase-
	 * check-trionic-array-via-naiv-esha/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7043399/easy-solution
	 * -in-java-in-on-time-by-kuma-ktls/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7040789/java-code-
	 * beats-100-by-reshu_upadhyay-yw7k/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7038099/enumeration-
	 * middle-on3-by-gitchuan-pu96/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7037979/on-java-
	 * solution-intuitie-by-alexishe-e2ne/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7037940/beats-100-
	 * detailed-explanation-java-c-py-lauz/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7037952/java-solution
	 * -by-solved-c91l/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7048399/java-on-
	 * solution-for-beginners-trionic-a-wnet/
	 * https://leetcode.com/problems/trionic-array-i/solutions/7046665/easy-java-
	 * solution-using-3-while-loops-b-xs5q/
	 */
	public boolean isTrionic(int[] A) {
		int p = 0, q = 0, n = A.length;
		for (int i = 1; i < n; ++i) {
			if (A[i - 1] == A[i]) {
				return false;
			}
			if (i >= 2 && A[i - 2] < A[i - 1] && A[i - 1] > A[i]) {
				if (p != 0 || q != 0) {
					return false;
				}
				p = i;
			}
			if (i >= 2 && A[i - 2] > A[i - 1] && A[i - 1] < A[i]) {
				if (p == 0 || q != 0) {
					return false;
				}
				q = i;
			}
		}
		return q > 0;
	}
}
