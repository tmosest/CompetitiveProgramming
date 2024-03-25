package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MaximumSizeOfSetAfterRemovals {
	/**
	 * https://leetcode.com/problems/maximum-size-of-a-set-after-removals/
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int maximumSetSize(int[] nums1, int[] nums2) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();

		for (int num : nums1) {
			set1.add(num);
			set3.add(num);
		}

		int result = 0;
		if (set1.size() > nums1.length / 2)
			result = nums1.length / 2;
		else
			result = set1.size();

		for (int num : nums2) {
			set2.add(num);
			set3.add(num);
		}

		if (set2.size() > nums2.length / 2)
			result += nums2.length / 2;
		else
			result += set2.size();

		return result > set3.size() ? set3.size() : result;
	}
}
