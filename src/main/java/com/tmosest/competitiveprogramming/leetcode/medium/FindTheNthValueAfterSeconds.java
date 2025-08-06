package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class FindTheNthValueAfterSeconds {
	private int mod = 1_000_000_007;

	/*
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/
	 * description/
	 * 
	 * You are given two integers n and k.
	 * 
	 * Initially, you start with an array a of n integers where a[i] = 1 for all 0
	 * <= i <= n - 1. After each second, you simultaneously update each element to
	 * be the sum of all its preceding elements plus the element itself. For
	 * example, after one second, a[0] remains the same, a[1] becomes a[0] + a[1],
	 * a[2] becomes a[0] + a[1] + a[2], and so on.
	 * 
	 * Return the value of a[n - 1] after k seconds.
	 * 
	 * Since the answer may be very large, return it modulo 109 + 7.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: n = 4, k = 5
	 * 
	 * Output: 56
	 * 
	 * Explanation:
	 * 
	 * Second State After
	 * 0 [1,1,1,1]
	 * 1 [1,2,3,4]
	 * 2 [1,3,6,10]
	 * 3 [1,4,10,20]
	 * 4 [1,5,15,35]
	 * 5 [1,6,21,56]
	 * Example 2:
	 * 
	 * Input: n = 5, k = 3
	 * 
	 * Output: 35
	 * 
	 * Explanation:
	 * 
	 * Second State After
	 * 0 [1,1,1,1,1]
	 * 1 [1,2,3,4,5]
	 * 2 [1,3,6,10,15]
	 * 3 [1,4,10,20,35]
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= n, k <= 1000
	 * 
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282084/easy-video-solution-how-to-in-interview-zqt17/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282511/prefixsum-k-times-by-jay_1410-xcr7/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282322/easiest-c-solution-by-edwards310-a5y8/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282421/no-dp-simulate-as-it-is-beginner-friendl-fjh9/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282432/short-code-easy-code-by-satyam_mishra_1-j77n/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282910/easy-java-solution-using-dp-by-sanjeev19-38cb/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5291594/3-approaches-for-optimal-performance-on-l0cg5/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282390/beats-100-of-users-with-java-easy-to-und-pkyl/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282142/easy-prefix-sum-java-by-leetcoder-oytv/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282403/easy-java-solution-by-anju_11-dqf5/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5282204/easy-understanding-solution-beats-100-in-7s1u/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 5283899/beats-100-java-solution-dp-by-agrwlaanch-3ggx/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 6905952/best-easy-to-understand-solution-okn-by-uqm7s/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 6841920/beats-90-java-essyy-by-atishayjain78001-elb3/
	 * https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/solutions/
	 * 6421262/easy-dp-problem-by-saurabhabd_360-45-26s5/
	 */
	public int valueAfterKSeconds(int n, int k) {
		int[] prev = new int[n];
		Arrays.fill(prev, 1);
		int[] cur = new int[n];
		for (int i = 1; i <= k; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum = (sum + prev[j]) % mod;
				cur[j] = sum;
			}
			prev = cur;
		}
		return prev[n - 1] % mod;
	}
}
