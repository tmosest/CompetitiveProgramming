package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumOperationsToMakeMedianOfArrayEqualTo {
	/**
	 * https://leetcode.com/problems/minimum-operations-to-make-median-of-array-equal-to-k/
	 * 
	 * https://www.geeksforgeeks.org/minimum-increment-decrement-operations-required-to-make-median-as-x/
	 * 
	 * https://www.geeksforgeeks.org/program-for-mean-and-median-of-an-unsorted-array/
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        
        long result = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
			// Look at all the numbers to the left of the median and see what we would need to change.
            if (i < nums.length / 2) {
                result += Math.max(0, nums[i] - k);
			// Look at the median
            } else if (i == nums.length / 2) {
                result += Math.abs(k - nums[i]);   
            } else {
			// Look to the right to see what we would need to change as well.
                result += Math.max(0, k - nums[i]);
            }
            
        }
        
        return result;
    }
}
