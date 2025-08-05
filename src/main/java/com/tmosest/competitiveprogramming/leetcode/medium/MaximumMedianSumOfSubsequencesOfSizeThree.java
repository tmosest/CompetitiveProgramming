package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MaximumMedianSumOfSubsequencesOfSizeThree {
	/*
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * description/
	 * 
	 * You are given an integer array nums with a length divisible by 3.
	 * 
	 * You want to make the array empty in steps. In each step, you can select any
	 * three elements from the array, compute their median, and remove the selected
	 * elements from the array.
	 * 
	 * The median of an odd-length sequence is defined as the middle element of the
	 * sequence when it is sorted in non-decreasing order.
	 * 
	 * Return the maximum possible sum of the medians computed from the selected
	 * elements.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,1,3,2,1,3]
	 * 
	 * Output: 5
	 * 
	 * Explanation:
	 * 
	 * In the first step, select elements at indices 2, 4, and 5, which have a
	 * median 3. After removing these elements, nums becomes [2, 1, 2].
	 * In the second step, select elements at indices 0, 1, and 2, which have a
	 * median 2. After removing these elements, nums becomes empty.
	 * Hence, the sum of the medians is 3 + 2 = 5.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,1,10,10,10,10]
	 * 
	 * Output: 20
	 * 
	 * Explanation:
	 * 
	 * In the first step, select elements at indices 0, 2, and 3, which have a
	 * median 10. After removing these elements, nums becomes [1, 10, 10].
	 * In the second step, select elements at indices 0, 1, and 2, which have a
	 * median 10. After removing these elements, nums becomes empty.
	 * Hence, the sum of the medians is 10 + 10 = 20.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 5 * 105
	 * nums.length % 3 == 0
	 * 1 <= nums[i] <= 109
	 * 
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7009779/easy-code-beginner-friendly-beats-100-by-wpi3/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7041004/java-24ms-onlogn-clean-code-by-aryanajwa-fsgu/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7009749/beginner-friendly-example-walkthrough-op-uquj/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7009964/javacpython-sort-by-lee215-uy0q/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7009923/sorting-onlogn-easy-code-by-ankith_kumar-2bsk/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7013742/java-solution-on-log-n-by-negi_mags-n2tf/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7012489/easy-solution-beats-98-java-by-rajan_sin-q23p/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7009837/two-pointer-by-gitchuan-s77u/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7011279/two-pointer-approach-greedy-solution-by-xiv03/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7009775/java-solution-by-solved-1m38/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7010837/stellars-clean-code-video-intuition-appr-fdus/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7010281/java-solution-by-chai0709-0o6g/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7009733/easy-java-solution-intuitive-deque-by-ra-w1e8/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7042046/java-solution-by-barakamon-xlmj/
	 * https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/
	 * solutions/7036290/java-code-by-sushma_kv-k2pt/
	 */
	public long maximumMedianSum(int[] nums) {
		int n = nums.length;
		long sum = 0;
		Arrays.sort(nums);

		for (int i = n - 2; i >= n / 3; i -= 2) {
			sum += nums[i];
		}
		return sum;
	}
}
