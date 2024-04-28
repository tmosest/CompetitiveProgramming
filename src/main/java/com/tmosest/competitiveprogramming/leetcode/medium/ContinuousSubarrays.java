package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

class ContinuousSubarrays {
	/**
	 * https://leetcode.com/problems/continuous-subarrays/description/
	 * 
	 * @param nums
	 * @return
	 */
	public long continuousSubarrays(int[] nums) {
		if (nums.length == 1)
			return 1;
		int i = 0, j = 0;
		long result = 0, count = 0, limit = 2;
		Deque<Integer> max_dq = new ArrayDeque<>();
		Deque<Integer> min_dq = new ArrayDeque<>();

		while (j < nums.length) {
			while (!max_dq.isEmpty() && nums[max_dq.peekLast()] < nums[j])
				max_dq.pollLast();
			max_dq.offerLast(j);

			while (!min_dq.isEmpty() && nums[min_dq.peekLast()] > nums[j])
				min_dq.pollLast();
			min_dq.offerLast(j);

			while (Math.abs(nums[j] - nums[min_dq.peekFirst()]) > limit ||
					Math.abs(nums[j] - nums[max_dq.peekFirst()]) > limit) {
				if (min_dq.peekFirst() == i)
					min_dq.pollFirst();
				if (max_dq.peekFirst() == i)
					max_dq.pollFirst();
				i++;
			}

			result += j - i + 1;
			j++;
		}

		return result;
	}
}
