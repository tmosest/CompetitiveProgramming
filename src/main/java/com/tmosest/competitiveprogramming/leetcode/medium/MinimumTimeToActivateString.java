package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.TreeSet;

class MinimumTimeToActivateString {
	/*
	 * https://leetcode.com/problems/minimum-time-to-activate-string/description/
	 * 
	 * You are given a string s of length n and an integer array order, where order
	 * is a permutation of the numbers in the range [0, n - 1].
	 * 
	 * Starting from time t = 0, replace the character at index order[t] in s with
	 * '*' at each time step.
	 * 
	 * A substring is valid if it contains at least one '*'.
	 * 
	 * A string is active if the total number of valid substrings is greater than or
	 * equal to k.
	 * 
	 * Return the minimum time t at which the string s becomes active. If it is
	 * impossible, return -1.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: s = "abc", order = [1,0,2], k = 2
	 * 
	 * Output: 0
	 * 
	 * Explanation:
	 * 
	 * t order[t] Modified s Valid Substrings Count Active
	 * (Count >= k)
	 * 0 1 "a*c" "*", "a*", "*c", "a*c" 4 Yes
	 * The string s becomes active at t = 0. Thus, the answer is 0.
	 * 
	 * Example 2:
	 * 
	 * Input: s = "cat", order = [0,2,1], k = 6
	 * 
	 * Output: 2
	 * 
	 * Explanation:
	 * 
	 * t order[t] Modified s Valid Substrings Count Active
	 * (Count >= k)
	 * 0 0 "*at" "*", "*a", "*at" 3 No
	 * 1 2 "*a*" "*", "*a", "*a*", "a*", "*" 5 No
	 * 2 1 "***" All substrings (contain '*') 6 Yes
	 * The string s becomes active at t = 2. Thus, the answer is 2.
	 * 
	 * Example 3:
	 * 
	 * Input: s = "xy", order = [0,1], k = 4
	 * 
	 * Output: -1
	 * 
	 * Explanation:
	 * 
	 * Even after all replacements, it is impossible to obtain k = 4 valid
	 * substrings. Thus, the answer is -1.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= n == s.length <= 105
	 * order.length == n
	 * 0 <= order[i] <= n - 1
	 * s consists of lowercase English letters.
	 * order is a permutation of integers from 0 to n - 1.
	 * 1 <= k <= 109
	 * 
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7037942/javacpython-treeset-by-lee215-sz0g/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7038111/easy-intuition-why-you-should-think-abou-uzfq/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7043076/solved-in-on-via-monotonic-stack-by-anmo-qbar/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7039282/minimum-time-to-activate-a-starry-string-7vu0/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7041355/playing-with-values-in-treeset-java-kotl-usp7/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7038046/treemap-onlogn-by-ankith_kumar-dl3m/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7038295/binary-search-by-7mhvr8obcn-k2lg/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7038031/easy-binary-search-on-time-in-java-by-17-xupb/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7037991/simple-binary-search-on-ans-beats-100-in-0176/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7037987/simple-binary-search-by-shanmuka_prasant-uysa/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7040410/binary-search-java-simple-by-ganeshmanch-1sbi/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7038390/treeset-approach-onlogn-by-pawaskarom958-a490/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7037969/java-solution-by-solved-sv32/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7042951/contest-461-question-3-onlogn-by-sajalti-ibyl/
	 * https://leetcode.com/problems/minimum-time-to-activate-string/solutions/
	 * 7040928/stellars-clean-code-video-intuition-appr-cl56/
	 */
	public int minTime(String s, int[] order, int k) {
		int n = s.length();

		long cnt = 0;
		TreeSet<Integer> sorted_list = new TreeSet<>(); // Use TreeSet as it's equivalent to Python's SortedList for
														// this problem

		sorted_list.add(-1); // Add a virtual star at the left boundary
		sorted_list.add(n); // Add a virtual star at the right boundary

		for (int i = 0; i < n; i++) {
			int curr_star = order[i];

			sorted_list.add(curr_star);

			// Find the positions of the stars immediately to the left and right
			int left_star = sorted_list.lower(curr_star);
			int right_star = sorted_list.higher(curr_star);

			// Calculate the cost added by this new star, using long to prevent overflow
			long ans = (long) (curr_star - left_star) * (right_star - curr_star);

			cnt += ans; // Accumulate the total cost

			if (cnt >= k) {
				return i; // If cost is met, return the current time (index)
			}
		}

		return -1; // Return -1 if loop completes and cost is not met
	}
}
