package com.tmosest.competitiveprogramming.leetcode.medium;

class FindIndicesWithIndexAndValueDifferenceTwo {
	/**
	 * https://leetcode.com/problems/find-indices-with-index-and-value-difference-ii/
	 * 
	 * @param A
	 * @param d
	 * @param v
	 * @return
	 */
	public int[] findIndices(int[] A, int d, int v) {
		int mini = 0, maxi = 0, n = A.length;
		for (int i = d; i < n; i++) {
			if (A[i - d] < A[mini])
				mini = i - d;
			if (A[i - d] > A[maxi])
				maxi = i - d;
			if (A[i] - A[mini] >= v)
				return new int[] { mini, i };
			if (A[maxi] - A[i] >= v)
				return new int[] { maxi, i };
		}
		return new int[] { -1, -1 };
	}
}
