package com.tmosest.competitiveprogramming.leetcode.easy;

class ValidMountainArray {
	/**
	 * Given an array of integers arr, return true if and only if it is a valid mountain array.
	 * Recall that arr is a mountain array if and only if:\
	 * arr.length >= 3
	 * There exists some i with 0 < i < arr.length - 1 such that
	 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
	 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
	 * 
	 * @param arr input array
	 * @return true if it is a valid mountain array.
	 */
	public boolean validMountainArray(int[] arr) {

		if (arr.length < 3) {
			return false;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			// check for not strictly increasing / decreasing.
			if (arr[i] == arr[i + 1]) {
				return false;
			}
		}

		int mountainI = 0;

		for (; mountainI < arr.length - 1; mountainI++) {
			if (arr[mountainI + 1] < arr[mountainI]) {
				break;
			}
		}

		if (mountainI == 0 || mountainI == arr.length - 1) {
			return false;
		}

		for (; mountainI < arr.length - 1; mountainI++) {
			if (arr[mountainI + 1] > arr[mountainI]) {
				return false;
			}
		}

		return true;
	}
}
