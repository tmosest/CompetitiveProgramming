package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;

class SortArrayByParityTwo {
	/**
	 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
	 *
	 *	Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
	 *
	 *	Return any answer array that satisfies this condition.
	 *
	 * @param nums an integer array
	 * @return Sorted array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
	 */
	public int[] sortArrayByParityII(int[] nums) {

		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();

		for (int x : nums) {
			if (x % 2 == 0) {
				evens.add(x);
			} else {
				odds.add(x);
			}
		}
		
		int[] res = new int[nums.length];

		for (int i = 0; i < nums.length; i+=2) {
			res[i] = evens.removeFirst();
		}

		for (int i = 1; i < nums.length; i +=2) {
			res[i] = odds.removeFirst();
		}

		return res;
	}
}
