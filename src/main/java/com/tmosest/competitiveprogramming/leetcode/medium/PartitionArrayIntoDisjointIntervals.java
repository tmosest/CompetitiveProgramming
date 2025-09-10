package com.tmosest.competitiveprogramming.leetcode.medium;

class PartitionArrayIntoDisjointIntervals {
	/*
	 * 915. Partition Array into Disjoint Intervals
	 * 
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * description/
	 * 
	 * Given an integer array nums, partition it into two (contiguous) subarrays
	 * left and right so that:
	 * 
	 * Every element in left is less than or equal to every element in right.
	 * left and right are non-empty.
	 * left has the smallest possible size.
	 * Return the length of left after such a partitioning.
	 * 
	 * Test cases are generated such that partitioning exists.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [5,0,3,8,6]
	 * Output: 3
	 * Explanation: left = [5,0,3], right = [8,6]
	 * Example 2:
	 * 
	 * Input: nums = [1,1,1,0,6,12]
	 * Output: 4
	 * Explanation: left = [1,1,1,0], right = [6,12]
	 * �
	 * 
	 * Constraints:
	 * 
	 * 2 <= nums.length <= 105
	 * 0 <= nums[i] <= 106
	 * There is at least one valid answer for the given input.
	 * 
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/7037192/easy-code-in-java-by-yasl1-ayng/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/1122368/java-2-solutions-by-himanshuchhikara-hg50/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/6613339/beats-100-smart-solution-javacpython-not-g2r1/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/6276645/java-c-most-optimal-single-pass-maximum-811q3/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/6599965/partition-array-into-disjoint-intervals-v3n8i/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/6620944/java-easy-solution-time-complexity-on-by-57l7/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/6586528/java-on-by-hanumana_ram-251h/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/2496228/java-tcon-sco1-with-comments-on-every-li-lhdw/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/1354779/partition-array-into-disjoint-intervals-az3p1/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/1354639/java-solution-explained-with-comments-by-4l8m/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/4073199/here-is-my-solution-on-for-java-by-furru-8bte/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/1131928/java-solution-beat-100-by-yuyuh-8dw3/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/3514724/solution-by-deleted_user-hq7x/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/3241893/java-easy-solution-0sec-by-sadanandsidhu-tw93/
	 * https://leetcode.com/problems/partition-array-into-disjoint-intervals/
	 * solutions/6891952/java-one-array-by-harshitsinghra_cs22-vnjt/
	 */
	/* public int partitionDisjoint(int[] nums) */
	public int partitionDisjoint(int[] A) {
		int[] lmax = new int[A.length]; // lmax :left maximum
		int[] rmin = new int[A.length]; // rmin : right minimum

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			max = Math.max(max, A[i]);
			lmax[i] = max;
		}

		int min = Integer.MAX_VALUE;
		for (int i = A.length - 1; i >= 0; i--) {
			min = Math.min(min, A[i]);
			rmin[i] = min;
		}

		for (int i = 1; i < A.length; i++) {
			if (lmax[i - 1] <= rmin[i])
				return i;
		}
		return A.length;
	}
}
