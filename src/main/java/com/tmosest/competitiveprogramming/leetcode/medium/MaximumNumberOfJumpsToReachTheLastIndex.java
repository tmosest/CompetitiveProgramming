package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumNumberOfJumpsToReachTheLastIndex {
	/**
	 * https://leetcode.com/problems/maximum-number-of-jumps-to-reach-the-last-index/description/
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int maximumJumps(int[] nums, int target) {
		Pair[] arr = new Pair[nums.length];
		arr[0] = new Pair(0, 0);
		for (int i = 1; i < nums.length; i++) {
			arr[i] = new Pair(-1, 0);
			for (int j = i - 1; j >= 0; j--) {
				if (Math.abs(nums[i] - nums[j]) <= target) {
					if (arr[j].prev != -1 && arr[j].len + 1 > arr[i].len) {
						arr[i].prev = j;
						arr[i].len = arr[j].len + 1;
					}
				}
			}
		}

		return arr[nums.length - 1].len > 0 ? arr[nums.length - 1].len : -1;
	}

	private static class Pair {
		private int prev;
		private int len;

		public Pair(int prev, int len) {
			this.prev = prev;
			this.len = len;
		}
	}
}
