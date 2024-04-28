package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class FindTheIntegerAddedToArrayOne {
	/**
	 * https://leetcode.com/contest/weekly-contest-395/problems/find-the-integer-added-to-array-i/
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int addedInteger(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		return nums2[0] - nums1[0];
	}
}
