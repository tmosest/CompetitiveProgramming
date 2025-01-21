package com.tmosest.competitiveprogramming.leetcode.easy;

class PartitionArrayIntoThreePartsWithEqualSum {
	/**
	 * Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.
	 * 
	 * Formally, we can partition the array if we can find indexes i + 1 < j 
	 * with (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])
	 * 
	 * @param arr An input array that we are looking to partition.
	 * @return True if we can get 3 equal partition sums.
	 */
	public boolean canThreePartsEqualSum(int[] arr) {

		int leftSum = 0;
		int middleSum = 0;
		int rightSum = 0;

		for (int num : arr) {
			middleSum += num;
		}

		if(middleSum % 3 != 0) return false;

		int target = middleSum / 3;
        int count = 0;
        int currentSum = 0;

        for(int num: arr) {
            currentSum += num;
            if(currentSum == target) {
                if(count == 2) return true;

                count++;
                currentSum = 0;
            }
        }

        return false;
	}
}
