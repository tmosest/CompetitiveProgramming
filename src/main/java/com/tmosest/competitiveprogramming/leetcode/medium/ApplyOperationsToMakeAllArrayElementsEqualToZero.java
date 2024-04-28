package com.tmosest.competitiveprogramming.leetcode.medium;

class ApplyOperationsToMakeAllArrayElementsEqualToZero {
	/**
	 * https://leetcode.com/problems/apply-operations-to-make-all-array-elements-equal-to-zero/description/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public boolean checkArray(int[] A, int k) {
        int cur = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (cur > A[i])
                return false;
            A[i] -= cur;
            cur += A[i];
            if (i >= k - 1)
                cur -= A[i - k + 1];
        }
        return cur == 0;
    }
}
