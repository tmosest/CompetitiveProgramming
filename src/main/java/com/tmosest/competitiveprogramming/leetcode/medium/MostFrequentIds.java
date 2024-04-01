package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class MostFrequentIds {
	/**
	 * https://leetcode.com/problems/most-frequent-ids/
	 * 
	 * @param nums
	 * @param freq
	 * @return
	 */
	public long[] mostFrequentIDs(int[] nums, int[] freq) {

		Map<Integer, Long> counts = new HashMap<>();
		PriorityQueue<long[]> priorityQueue = new PriorityQueue<>((a, b) -> (int) (b[1] - a[1]));

		long[] results = new long[nums.length];

		for (int i = 0; i < nums.length; i++) {
			counts.put(nums[i], counts.getOrDefault(nums[i], 0L) + freq[i]);
			long count = counts.get(nums[i]);
			
			priorityQueue.add(new long[] { nums[i], count });

			long a[] = priorityQueue.remove();

			while (!priorityQueue.isEmpty() && a[1] != counts.get((int) a[0])) {
				a = priorityQueue.remove();
			}

			results[i] = a[1];
			priorityQueue.add(a);
		}

		return results;
	}
}
