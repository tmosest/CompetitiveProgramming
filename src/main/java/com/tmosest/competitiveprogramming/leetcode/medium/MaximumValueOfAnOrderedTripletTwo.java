package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumValueOfAnOrderedTripletTwo {
	/**
	 * https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/
	 * 
	 * @param nums
	 * @return
	 */
	public long maximumTripletValue(int[] a) {
		int[][] preprocess = new int[a.length][2];
		for (int i = 0; i < a.length; i++) {
			preprocess[i] = new int[] { Integer.MIN_VALUE, Integer.MIN_VALUE };
		}
		for (int i = 1; i < a.length; i++) {
			preprocess[i][0] = Math.max(preprocess[i - 1][0], a[i - 1]);
		}
		for (int i = a.length - 2; i >= 0; i--) {
			preprocess[i][1] = Math.max(preprocess[i + 1][1], a[i + 1]);
		}
		long max = 0;
		for (int i = 1; i < a.length - 1; i++) {
			int left = preprocess[i][0], right = preprocess[i][1];
			long temp = (left - a[i]) * ((long) right);
			max = Math.max(max, temp);
		}
		return max;
	}
}
