package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;

class SortArrayByParity {

	public int[] sortArrayByParity(int[] nums) {

		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();

		for (int num : nums) {
			if (num % 2 == 0) {
				evens.add(num);
			} else {
				odds.add(num);
			}
		}

		int[] res = new int[nums.length];

		int i = 0;

		for (; i < evens.size(); i++) {
			res[i] = evens.get(i);
		}

		for (int j = 0; j < odds.size(); j++) {
			res[i] = odds.get(j);
			i++;
		}

		return res;
	}
}
