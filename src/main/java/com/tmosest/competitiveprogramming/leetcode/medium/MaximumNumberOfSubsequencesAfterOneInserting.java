package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumNumberOfSubsequencesAfterOneInserting {
	/*
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/description/
	 * 
	 * You are given a string s consisting of uppercase English letters.
	 * 
	 * You are allowed to insert at most one uppercase English letter at any
	 * position (including the beginning or end) of the string.
	 * 
	 * Return the maximum number of "LCT" subsequences that can be formed in the
	 * resulting string after at most one insertion.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: s = "LMCT"
	 * 
	 * Output: 2
	 * 
	 * Explanation:
	 * 
	 * We can insert a "L" at the beginning of the string s to make "LLMCT", which
	 * has 2 subsequences, at indices [0, 3, 4] and [1, 3, 4].
	 * 
	 * Example 2:
	 * 
	 * Input: s = "LCCT"
	 * 
	 * Output: 4
	 * 
	 * Explanation:
	 * 
	 * We can insert a "L" at the beginning of the string s to make "LLCCT", which
	 * has 4 subsequences, at indices [0, 2, 4], [0, 3, 4], [1, 2, 4] and [1, 3, 4].
	 * 
	 * Example 3:
	 * 
	 * Input: s = "L"
	 * 
	 * Output: 0
	 * 
	 * Explanation:
	 * 
	 * Since it is not possible to obtain the subsequence "LCT" by inserting a
	 * single letter, the result is 0.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 105
	 * s consists of uppercase English letters.
	 * 
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7009729/prefix-and-suffix-sum-detailed-explanati-tomq/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7009785/simple-java-solution-with-prefix-and-suf-7z5p/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7013590/java-100-with-greedy-solution-on-by-meri-7wuf/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7009935/suffix-on-by-ankith_kumar-f0l4/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7011136/simple-solution-prefix-suffix-greedy-by-lgncm/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7009846/simple-solution-by-singh_abhiishek-ic37/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7009782/java-solution-by-solved-lerj/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7009988/easy-beginner-friendly-solution-easily-u-7x8a/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7021619/java-greedy-on-space-on-solution-by-qing-b7ri/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7012043/2-appraoches-by-kj1000-2ye9/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7011162/just-works-by-utalmighty-saq1/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7010093/easy-intuitive-solution-by-arham121-reoi/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7019895/java-solution-finally-did-post-contest-b-jydc/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7015753/using-prefix_l-and-suffix_t-of-an-array-5wqvq/
	 * https://leetcode.com/problems/maximum-number-of-subsequences-after-one-
	 * inserting/solutions/7010726/three-ways-lt-and-c-l-and-t-are-add-at-f-xy2s/
	 */
	public long numOfSubsequences(String s) {
		int n = s.length();
		long l = 0, c = 0, count = 0;
		int lc = 0, cc = 0, tc = 0;
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (ch == 'L') {
				l++;
				lc++;
			} else if (ch == 'C') {
				c += l;
				cc++;
			} else if (ch == 'T') {
				count += c;
				tc++;
			}
		}

		long max = count;
		long m;
		m = 0;
		long x, y;
		x = 1;
		y = tc;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'L')
				x++;
			if (s.charAt(i) == 'C') {
				m += x * y;
			}

			if (s.charAt(i) == 'T')
				y--;
		}
		max = Math.max(max, m);
		m = 0;

		x = 0;
		y = tc + 1;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'L')
				x++;
			if (s.charAt(i) == 'C') {
				m += x * y;
			}

			if (s.charAt(i) == 'T')
				y--;
		}
		max = Math.max(max, m);

		m = 0;
		x = 0;
		y = tc;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'L')
				x++;

			m = Math.max(m, x * y);
			if (s.charAt(i) == 'T')
				y--;
		}
		max = Math.max(max, count + m);

		return max;
	}
}
