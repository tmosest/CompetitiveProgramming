package com.tmosest.competitiveprogramming.leetcode.medium;

class LongestNondecreasingSubarrayFromTwoArrays {
	/**
	 * https://leetcode.com/problems/longest-non-decreasing-subarray-from-two-arrays/description/
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int maxNonDecreasingLength(int[] A, int[] B) {
		int res = 1;
		int dp1 = 1;
		int dp2 = 1;
		int n = A.length;
		int t11;
		int t12;
		int t21;
		int t22;
		
		for (int i = 1; i < n; ++i) {
			t11 = A[i - 1] <= A[i] ? dp1 + 1 : 1;
			t12 = A[i - 1] <= B[i] ? dp1 + 1 : 1;
			t21 = B[i - 1] <= A[i] ? dp2 + 1 : 1;
			t22 = B[i - 1] <= B[i] ? dp2 + 1 : 1;
			dp1 = Math.max(t11, t21);
			dp2 = Math.max(t12, t22);
			res = Math.max(res, Math.max(dp1, dp2));
		}
		return res;
	}
}
