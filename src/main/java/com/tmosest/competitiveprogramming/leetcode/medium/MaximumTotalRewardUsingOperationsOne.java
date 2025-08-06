package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MaximumTotalRewardUsingOperationsOne {
	private int memo[][];

	/*
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
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
	 * 1 <= rewardValues.length <= 2000
	 * 1 <= rewardValues[i] <= 2000
	 * 
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282063/easy-video-solution-how-to-in-interview-hifru/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282525/dynamic-programming-tutorial-maximum-tot-goid/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5283430/beats-100-4-approaches-must-watch-by-san-w6u3/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282283/why-20014001-explained-easy-c-solution-k-v3ip/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5287466/easy-understanding-memo-solution-pick-no-rbcc/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5284545/intution-knapsack-subproblem-beats-100-t-6lsd/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282346/easiestfaster-lesser-cpython3javacpython-0bg8/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282843/easy-java-solution-using-dp-by-sanjeev19-53uk/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5287388/beat-100-java-very-easy-1d-boolean-dp-11-lvrs/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282371/100-fast-java-easy-solution-sortingrecus-njyv/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282163/java-easy-to-understand-pick-dont-pick-a-9kcj/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5301375/beats-75-java-recursion-dynamic-programm-kayl/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282176/sorting-by-anau99-vq15/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282031/simple-and-easy-dp-approach-1-d-array-c-9yn83/
	 * https://leetcode.com/problems/maximum-total-reward-using-operations-i/
	 * solutions/5282159/help-why-it-is-giving-tle-if-i-fixed-len-bf4c/
	 */
	public int maxTotalReward(int[] nums) {
		memo = new int[nums.length][4005];
		// here if initialize memo =new int[2001][4005];
		// it is giving TLE
		for (int i[] : memo) {
			Arrays.fill(i, -1);
		}
		Arrays.sort(nums);
		return fun(0, nums, nums.length, 0);
	}

	private int fun(int i, int nums[], int n, int score) {
		if (i >= n) {
			return score;
		}
		if (score >= 2000) {
			return score;
		}
		if (memo[i][score] != -1) {
			return memo[i][score];
		}
		int not = fun(i + 1, nums, n, score);
		int take = 0;
		if (score < nums[i]) {
			take = fun(i + 1, nums, n, score + nums[i]);
		}

		return memo[i][score] = Math.max(take, not);
	}
}
