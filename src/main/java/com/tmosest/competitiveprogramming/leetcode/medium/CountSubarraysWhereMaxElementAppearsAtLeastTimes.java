package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CountSubarraysWhereMaxElementAppearsAtLeastTimes {
	/**
	 * https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public long countSubarrays(int[] nums, int k) {
		int maxElement = Arrays.stream(nums).max().getAsInt();
		List<Integer> indexesOfMaxElements = new ArrayList<>();
		long ans = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == maxElement) {
				indexesOfMaxElements.add(i);
			}

			int freq = indexesOfMaxElements.size();
			if (freq >= k) {
				ans += indexesOfMaxElements.get(freq - k) + 1;
			}
		}

		return ans;
	}
}
