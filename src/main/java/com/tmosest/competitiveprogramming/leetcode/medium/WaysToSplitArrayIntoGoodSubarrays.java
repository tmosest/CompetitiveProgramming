package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class WaysToSplitArrayIntoGoodSubarrays {
	/**
	 * https://leetcode.com/problems/ways-to-split-array-into-good-subarrays/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int numberOfGoodSubarraySplits(int[] nums) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				list.add(i);
		}
		if (list.size() == 0)
			return 0;
		if (list.size() == 1)
			return 1;
		int mod = (int) 1e9 + 7;
		long res = 1;
		for (int i = 0; i < list.size() - 1; i++) {
			long index1 = (long) list.get(i);
			long index2 = (long) list.get(i + 1);
			res = (res % mod * (index2 - index1) % mod) % mod;

		}
		return (int) res;
	}
}
