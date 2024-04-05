package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumOperationsToMaximizeLastElementsInArrays {
	/**
	 * https://leetcode.com/problems/minimum-operations-to-maximize-last-elements-in-arrays/description/
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length;
        //swap last 
        int swap = count(nums1, nums2, n-2, nums2[n-1], nums1[n-1]); 
        swap = swap == Integer.MAX_VALUE ? swap : swap+1;
		
        int notSwap = count(nums1, nums2, n-2, nums1[n-1], nums2[n-1]); 
        
        int ans = Math.min(swap, notSwap);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
	
    private int count(int[] nums1, int[] nums2, int i, int max1, int max2){
        if(i==-1)
            return 0;
        // swap not req
        if(nums1[i] <= max1 && nums2[i] <= max2){
            return count(nums1, nums2, i-1, max1, max2);
        }
        //swap req and possible
        if(nums1[i] <= max2 && nums2[i] <= max1){
            int ans = count(nums1, nums2, i-1, max1, max2);
            return ans == Integer.MAX_VALUE ? ans : ans + 1;
        }
        return Integer.MAX_VALUE;
    }
}
