package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MaximumBeautyOfAnArrayAfterApplyingOperation {
	/**
	 * https://leetcode.com/problems/maximum-beauty-of-an-array-after-applying-operation/description/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int maximumBeauty(int[] A, int k) {
		Arrays.sort(A);
		int i = 0, j, n = A.length;
		for (j = 0; j < n; ++j)
			if (A[j] - A[i] > k * 2)
				i++;
		return j - i;
	}
}
