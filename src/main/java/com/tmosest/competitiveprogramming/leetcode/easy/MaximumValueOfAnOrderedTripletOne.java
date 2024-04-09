package com.tmosest.competitiveprogramming.leetcode.easy;

class MaximumValueOfAnOrderedTripletOne {
	/**
	 * https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/
	 * 
	 * @param nums
	 * @return
	 */
	public long maximumTripletValue(int[] nums) {
		int sz = nums.length;
		int[] mxFromRightTill = new int[sz];
		mxFromRightTill[sz - 1] = nums[sz - 1];
		long maxVal = 0;
		for (int indx = sz - 2; indx >= 0; indx--) {
			mxFromRightTill[indx] = Math.max(mxFromRightTill[indx + 1], nums[indx]);
		}
		int mxFromLeft = nums[0];
		for (int indx = 1; indx < sz - 1; indx++) {
			mxFromLeft = Math.max(mxFromLeft, nums[indx - 1]);
			if (nums[indx] < mxFromLeft) {
				maxVal = Math.max(maxVal, (mxFromLeft - nums[indx]) * (long) mxFromRightTill[indx + 1]);
			}
		}
		return maxVal;
	}
}
