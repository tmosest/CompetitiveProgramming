package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

import com.tmosest.competitiveprogramming.datastructures.implementations.ArrayList;

class MarkElementsOnArrayByPerformingQueries {

	public long[] unmarkedSumArray(int[] nums, int[][] q) {
		HashSet<Integer> hs = new HashSet<>(); // To store all visited index
		long sum = 0;

		int[] check = new int[nums.length]; // Store index as per smallest value
		long[] ans = new long[q.length];
		for (int e : nums)
			sum += e;
		TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
		// TreeMap to get the nums value in sorted order as key and all index storing
		// that key is stored in arraylist as values.
		// For nums=[1,2,2,1,2,3,1]
		// tm = (1 (0,3,6), 2 (2,4) , 3 (5)) --> (key, value) format
		for (int i = 0; i < nums.length; i++) {
			if (!tm.containsKey(nums[i])) {
				ArrayList<Integer> arr = new ArrayList<>();
				arr.add(i);
				tm.put(nums[i], arr);
			} else {
				tm.get(nums[i]).add(i);
			}
		}
		int ind = 0;
		for (Map.Entry<Integer, ArrayList<Integer>> e : tm.entrySet()) {
			ArrayList<Integer> a = e.getValue();
			for (int h = 0; h < a.size(); h++) {
				check[ind] = a.get(h);
				ind++;
			}
		}
		int now = 0;
		for (int i = 0; i < q.length; i++) {
			if (!hs.contains(q[i][0])) {
				sum -= nums[q[i][0]];
				hs.add(q[i][0]);
			}

			int count = q[i][1];
			for (int j = 0; j < count; j++) {
				if (now != check.length) {
					if (!hs.contains(check[now])) {
						sum -= nums[check[now]];
						hs.add(check[now]);
					} else
						j--; // if it already contains then we need one more round of iteration
					now++;
				}
			}
			ans[i] = sum;
		}
		return ans;
	}
}
