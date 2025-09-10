package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximizeTotalCostOfAlternatingSubarrays {
	/*
	 * 3196. Maximize Total Cost of Alternating Subarrays
	 * 
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * description/
	 * 
	 * You are given an integer array nums with length n.
	 * 
	 * The cost of a subarray nums[l..r], where 0 <= l <= r < n, is defined as:
	 * 
	 * cost(l, r) = nums[l] - nums[l + 1] + ... + nums[r] * (-1)r - l
	 * 
	 * Your task is to split nums into subarrays such that the total cost of the
	 * subarrays is maximized, ensuring each element belongs to exactly one
	 * subarray.
	 * 
	 * Formally, if nums is split into k subarrays, where k > 1, at indices i1, i2,
	 * ..., ik - 1, where 0 <= i1 < i2 < ... < ik - 1 < n - 1, then the total cost
	 * will be:
	 * 
	 * cost(0, i1) + cost(i1 + 1, i2) + ... + cost(ik - 1 + 1, n - 1)
	 * 
	 * Return an integer denoting the maximum total cost of the subarrays after
	 * splitting the array optimally.
	 * 
	 * Note: If nums is not split into subarrays, i.e. k = 1, the total cost is
	 * simply cost(0, n - 1).
	 * 
	 * ÔøΩ
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,-2,3,4]
	 * 
	 * Output: 10
	 * 
	 * Explanation:
	 * 
	 * One way to maximize the total cost is by splitting [1, -2, 3, 4] into
	 * subarrays [1, -2, 3] and [4]. The total cost will be (1 + 2 + 3) + 4 = 10.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,-1,1,-1]
	 * 
	 * Output: 4
	 * 
	 * Explanation:
	 * 
	 * One way to maximize the total cost is by splitting [1, -1, 1, -1] into
	 * subarrays [1, -1] and [1, -1]. The total cost will be (1 + 1) + (1 + 1) = 4.
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [0]
	 * 
	 * Output: 0
	 * 
	 * Explanation:
	 * 
	 * We cannot split the array further, so the answer is 0.
	 * 
	 * Example 4:
	 * 
	 * Input: nums = [1,-1]
	 * 
	 * Output: 2
	 * 
	 * Explanation:
	 * 
	 * Selecting the whole array gives a total cost of 1 + 1 = 2, which is the
	 * maximum.
	 * 
	 * ÔøΩ
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 105
	 * -109 <= nums[i] <= 109
	 * 
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355138/dynamic-programming-and-space-optimized-3by5a/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355259/javacpython-easy-and-concise-o1-space-by-a12s/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355131/javapython-3-dp-on-codes-from-space-on-t-puos/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355223/solution-by-dare2solve-detailed-explanat-c23m/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355800/simple-dp-approach-memorization-java-c-p-pthc/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5357552/detailed-explanation-recursive-memoized-7pzfn/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5362366/cpython3java-solution-beats-100-4-line-b-5036/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5356477/explained-tabulation-dynamic-programming-a2h8/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5359104/beats-100-considers-all-conditions-seper-njwb/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355516/beats-100-1d-dp-detailed-step-by-step-ex-njhu/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355279/beginner-friendly-approachtake-not-take-78cd2/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355599/simple-dp-similar-to-takenot-take-by-har-bhds/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355713/recursive-meme-tle-by-vaibhav1701-2q53/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5355334/greedy-approach-explained-python-c-java-neisb/
	 * https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/
	 * solutions/5468359/java-100-faster-2d-dp-positive-negative-vrg2i/
	 */
	/* public long maximumTotalCost(int[] nums) */
	public long maximumTotalCost(int[] nums) {

		int n = nums.length;
		long add = 0, sub = 0;
		if (n == 1) {
			return nums[0];
		}
		// long[][] dp = new long[n][2];

		// dp[0][0] = nums[0];
		// dp[0][1] = nums[0];
		add = nums[0];
		sub = nums[0];

		for (int i = 1; i < n; i++) {
			long temp = Math.max(add, sub) + nums[i];
			sub = add - nums[i];
			add = temp;
		}

		return Math.max(add, sub);
	}
}
