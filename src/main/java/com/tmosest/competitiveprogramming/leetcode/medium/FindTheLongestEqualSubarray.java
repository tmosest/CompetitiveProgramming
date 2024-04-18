package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class FindTheLongestEqualSubarray {
	/**
	 * https://leetcode.com/problems/find-the-longest-equal-subarray/description/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int longestEqualSubarray(List<Integer> nums, int k) {
		// we create a queue for each unique number
		Map<Integer, Queue<Integer>> map = new HashMap<>();
		int res = 0;

		for (int i = 0; i < nums.size(); i++) {
			map.computeIfAbsent(nums.get(i), key -> new ArrayDeque<>()).offer(i);
			Queue<Integer> queue = map.get(nums.get(i));

			// the queue stores all index(not all per se since we may have removed index
			// outside of k range)
			// for current number/nums.get(i)
			// we keep removing element from queue if more than k other numbers exist
			// between the first index and current index
			while (i - queue.peek() + 1 > queue.size() + k) {
				queue.poll();
			}
			// update max if needed
			res = Math.max(res, queue.size());
		}

		return res;
	}
}
