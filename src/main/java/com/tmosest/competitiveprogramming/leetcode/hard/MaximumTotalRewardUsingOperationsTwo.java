package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MaximumTotalRewardUsingOperationsTwo {
	/*
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * description/
	 * 
	 * You are given an integer array rewardValues of length n, representing the
	 * values of rewards.
	 * 
	 * Initially, your total reward x is 0, and all indices are unmarked. You are
	 * allowed to perform the following operation any number of times:
	 * 
	 * Choose an unmarked index i from the range [0, n - 1].
	 * If rewardValues[i] is greater than your current total reward x, then add
	 * rewardValues[i] to x (i.e., x = x + rewardValues[i]), and mark the index i.
	 * Return an integer denoting the maximum total reward you can collect by
	 * performing the operations optimally.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: rewardValues = [1,1,3,3]
	 * 
	 * Output: 4
	 * 
	 * Explanation:
	 * 
	 * During the operations, we can choose to mark the indices 0 and 2 in order,
	 * and the total reward will be 4, which is the maximum.
	 * 
	 * Example 2:
	 * 
	 * Input: rewardValues = [1,6,4,3,2]
	 * 
	 * Output: 11
	 * 
	 * Explanation:
	 * 
	 * Mark the indices 0, 2, and 1 in order. The total reward will then be 11,
	 * which is the maximum.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= rewardValues.length <= 5 * 104
	 * 1 <= rewardValues[i] <= 5 * 104
	 * 
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5284305/java-intuition-described-in-crazy-detail-jkfh/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5282597/solution-by-dare2solve-detailed-explanat-b2qd/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5285130/java-biginteger-sorting-cache-by-vietnha-ck2z/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5319431/java-intuitive-method-using-treesetno-bi-f5ae/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5282986/java-easy-to-read-code-by-yakkala1-thl7/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5284969/java-2ms-recursive-solution-with-explana-rfhx/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5283167/java-with-biginteger-bit-manipulation-wi-ettf/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5290658/bitset-solution-in-java-beats-100-by-klx-2yf0/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5285892/java-biginteger-dp-bitmask-by-yash_nayak-6jq0/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5387048/treeset-based-solution-by-oppenheimer_1-gkio/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5283719/java-improved-from-dare2solves-solution-jsm4u/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-ii/
	 * solutions/5282164/easiest-solution-approach-c-java-python-xazrt/
	 */
	Map<Integer, Integer> dp = new HashMap<>();

	public int maxTotalReward(int[] arr) {
		arr = removeDups(arr);
		return arr[arr.length - 1] + rec(arr, arr[arr.length - 1] - 1);
	}

	private int rec(int[] arr, int lim) {
		if (lim == 0) {
			return 0;
		}
		if (dp.get(lim) != null) {
			return dp.get(lim);
		}
		int ind = find(arr, lim);
		if (ind == -1) {
			return lim;
		}
		int res = 0;
		for (int i = 0; i < ind; i++) {
			if (arr[i] * 2 - 1 <= res) {
				break;
			}
			res = Math.max(res, arr[i] + rec(arr, Math.min(lim - arr[i], arr[i] - 1)));
		}
		dp.put(lim, res);
		return res;
	}

	private int find(int[] arr, int x) {
		int lo = 0;
		int hi = arr.length - 1;
		int res = -1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (arr[mid] == x) {
				return -1;
			} else if (arr[mid] < x) {
				lo = mid + 1;
			} else {
				res = mid;
				hi = mid - 1;
			}
		}
		return res;
	}

	private int[] removeDups(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		int[] res = new int[set.size()];
		int i = 0;
		for (int num : set) {
			res[i++] = num;
		}
		Arrays.sort(res);
		return res;
	}
}
