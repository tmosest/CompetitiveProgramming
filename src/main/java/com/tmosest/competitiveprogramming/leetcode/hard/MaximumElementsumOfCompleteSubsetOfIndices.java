package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

class MaximumElementsumOfCompleteSubsetOfIndices {
	/**
	 * https://leetcode.com/problems/maximum-element-sum-of-a-complete-subset-of-indices/description/
	 * 
	 * https://leetcode.com/problems/maximum-element-sum-of-a-complete-subset-of-indices/solutions/4058306/simple-math-with-detailed-explanation/
	 * 
	 * @param nums
	 * @return
	 */
	public long maximumSum(List<Integer> nums) {
		int n = nums.size(); // Get the size of the input list.
		long res = -1; // Initialize the result to -1.

		// Loop over a base value from 1 to n (inclusive).
		for (int base = 1; base <= n; base++) {
			long cur = 0; // Initialize a variable to store the current sum.

			// Loop over indices (i) such that i * i * base is less than or equal to n.
			for (int i = 1; i * i * base <= n; i++) {
				// Add the element at the computed index to the current sum.
				cur += nums.get(i * i * base - 1);
			}

			// Update the result by taking the maximum of the current sum and the previous
			// result.
			res = Math.max(res, cur);
		}

		// Return the maximum sum found.
		return res;
	}
}
