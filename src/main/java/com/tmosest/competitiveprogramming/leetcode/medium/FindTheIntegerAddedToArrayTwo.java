package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class FindTheIntegerAddedToArrayTwo {
	/**
	 * https://leetcode.com/contest/weekly-contest-395/problems/find-the-integer-added-to-array-ii/
	 * 
	 * I don't agree with this approach but it works. Basically, we know that a number in the first array will match with one of the first three elements.
	 * 
	 * https://leetcode.com/problems/find-the-integer-added-to-array-ii/solutions/5082113/optimal-solution-check-only-3-differences-o-nlogn-c-java/
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n= nums1.length, ans = Integer.MAX_VALUE;
        int [] diffs = {nums2[0]-nums1[0],nums2[0]-nums1[1],nums2[0]-nums1[2]};
        for(int diff : diffs) {
            int j=0, deleted=0;
            for(int i=0;i<n && j<n-2 ;i++){
                if(nums2[j]-nums1[i] != diff){
                    deleted++;
                }
                else {
                    j++;
                }
                if( deleted>2 ){
                    break;
                }
            }
            if(j==n-2){
                ans = Math.min(ans,diff);
            }
        }
        return ans;
    }
}
