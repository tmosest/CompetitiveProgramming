package com.tmosest.competitiveprogramming.leetcode.medium;

class ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualTo {
	/**
	 * https://leetcode.com/problems/apply-operations-to-make-sum-of-array-greater-than-or-equal-to-k/
	 * 
	 * @param k
	 * @return
	 */
	public int minOperations(int k) {
		
		if (k == 1) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int i = 1; i <= k; i++) {
			int count = i - 1;
			int temp = i;
			while (temp < k) {
				count++;
				temp += i;
			}
			min = Math.min(min, count);
		}

		return min;
	}

	// Wow this one is really good.
	// O(1)
	public int minOperationsBest(int k) {
        double x = Math.ceil(Math.pow(k, 0.5) - 1);
        double y = Math.ceil(k/(x+1) - 1);
        return (int)(x+y);
    }
}
