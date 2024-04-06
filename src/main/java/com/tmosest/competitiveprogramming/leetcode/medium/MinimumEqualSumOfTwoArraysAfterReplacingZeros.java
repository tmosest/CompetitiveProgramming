package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumEqualSumOfTwoArraysAfterReplacingZeros {
	/**
	 * https://leetcode.com/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros/description/
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public long minSum(int[] nums1, int[] nums2) {
		long total1 = 0;
		long total2 = 0;
		long zeros1 = 0;
		long zeros2 = 0;

		for (int i = 0; i < nums1.length; i++) {
			total1 += nums1[i];
			zeros1 += nums1[i] == 0 ? 1 : 0;
		}

		for (int i = 0; i < nums2.length; i++) {
			total2 += nums2[i];
			zeros2 += nums2[i] == 0 ? 1 : 0;
		}

		long min1 = total1 + zeros1;
		long min2 = total2 + zeros2;
		long diff = min1 - min2;
		if (diff == 0) {
			return min1;
		} else if (diff > 0) {
			return zeros2 == 0 ? -1 : min1;
		} else {
			return zeros1 == 0 ? -1 : min2;
		}
	}
}
