package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;
import java.util.ArrayList;

class DistributeElementsIntoTwoArraysTwo {
	/**
	 * https://leetcode.com/contest/weekly-contest-387/problems/distribute-elements-into-two-arrays-ii/
	 * https://www.geeksforgeeks.org/binary-indexed-tree-or-fenwick-tree-2/
	 * https://codeforces.com/blog/entry/11080
	 * https://www.youtube.com/watch?v=zcwOff4MvbQ
	 * 
	 * @param nums
	 * @return
	 */
	public int[] resultArray(int[] nums) {
		ArrayList<Integer> arr1 = new ArrayList<>(), arr2 = new ArrayList<>();
		ArrayList<Integer> arr1Sorted = new ArrayList<>(), arr2Sorted = new ArrayList<>();

		arr1.add(nums[0]);
		arr2.add(nums[1]);
		arr1Sorted.add(nums[0]);
		arr2Sorted.add(nums[1]);

		for (int i = 2; i < nums.length; i++) {
			int val = nums[i];
			int pos1 = binarySearch(arr1Sorted, val), pos2 = binarySearch(arr2Sorted, val);
			int gc1 = arr1.size() - pos1;
			int gc2 = arr2.size() - pos2;

			if (gc1 > gc2) {
				arr1.add(val);
				arr1Sorted.add(pos1, val);
			}

			else if (gc2 > gc1) {
				arr2.add(val);
				arr2Sorted.add(pos2, val);
			}

			else {
				if (arr2.size() < arr1.size()) {
					arr2.add(val);
					arr2Sorted.add(pos2, val);
				} else {
					arr1.add(val);
					arr1Sorted.add(pos1, val);
				}
			}
		}
		int i = 0;
		for (int num : arr1) {
			nums[i++] = num;
		}
		for (int num : arr2) {
			nums[i++] = num;
		}
		return nums;
	}

	public int binarySearch(List<Integer> arr, int val) {
		int left = 0;
		int right = arr.size() - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr.get(mid) <= val)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return left;
	}
}
