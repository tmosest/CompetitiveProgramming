package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MinimumNumberOfCoinsToBeAdded {
	/**
	 * https://leetcode.com/problems/minimum-number-of-coins-to-be-added/
	 * 
	 * @param coins
	 * @param target
	 * @return
	 */
	public int minimumAddedCoins(int[] coins, int target) {
		Arrays.sort(coins);
		// [0, 1) is the begining. We can cover 0 without using any element.
		int right = 1;
		int result = 0;
		int idx = 0;
		// while we have not coverd the target
		while (right <= target) {
			if (idx < coins.length && coins[idx] <= right) {
				// if the coin can be used, then you should use it to make the cover longer.
				right += coins[idx];
				idx++;
			} else {
				// if the coin can't be used. Insert the right most coin greedily.
				right += right;
				result++;
			}
		}
		return (int) result;
	}
}
