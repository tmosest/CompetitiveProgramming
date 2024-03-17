package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


class InsertInterval {
	/**
	 * https://leetcode.com/problems/insert-interval/description/?envType=daily-question&envId=2024-03-17
	 * @param intervals
	 * @param newInterval
	 * @return
	 */
	public int[][] insert(int[][] intervals, int[] newInterval) { 
		List<int[]> result = new ArrayList<>();

		if (intervals.length == 0) {
			result.add(newInterval);
			return result.toArray(new int[result.size()][2]);
		}

		PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(intervals.length, new Comparator<int[]>() {
			public int compare(int[] one, int[] two) {
				return Integer.compare(one[0], two[0]);
			}
		});

		priorityQueue.add(newInterval);
		priorityQueue.addAll(Arrays.stream(intervals).toList());

		while (!priorityQueue.isEmpty()) {
			int[] current = priorityQueue.poll();
			
			if (priorityQueue.isEmpty()) {
				result.add(current);
				continue;
			}

			int[] next = priorityQueue.poll();

			if (current[0] <= next[0] && next[0] <= current[1]) {
				int[] updatedInterval = new int[] {Math.min(current[0], next[0]), Math.max(current[1], next[1])};
				priorityQueue.add(updatedInterval);
			} else {
				result.add(current);
				priorityQueue.add(next);
			}
		}

		return result.toArray(new int[result.size()][2]);
	}
}
