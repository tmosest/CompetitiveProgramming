package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class LargestElementInAnArrayAfterMergeOperations {
	/**
	 * https://leetcode.com/problems/largest-element-in-an-array-after-merge-operations/description/
	 * 
	 * @param nums
	 * @return
	 */
	public long maxArrayValue(int[] nums) {
		List<Long> a = new ArrayList<>(); // Create a new ArrayList to store long integers

		int size = nums.length;

		for (int i = 0; i < size; i++) {
			a.add((long) nums[i]); // Convert the elements of the input list to long and add to the new list
		}

		for (int i = a.size() - 1; i > 0; i--) {
			if (a.get(i - 1) <= a.get(i)) {
				a.set(i - 1, a.get(i) + a.get(i - 1)); // If the previous element is less than or equal to the current
														// element, update the previous element by adding the current
														// element
			}
		}

		return a.stream().mapToLong(Long::longValue).max().orElse(0); // Find the maximum element in the list and return
																		// it
	}
}
