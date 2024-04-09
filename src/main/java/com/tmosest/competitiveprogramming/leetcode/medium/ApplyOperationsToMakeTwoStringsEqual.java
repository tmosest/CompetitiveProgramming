package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ApplyOperationsToMakeTwoStringsEqual {
	private int dp[][];

	/**
	 * https://leetcode.com/problems/apply-operations-to-make-two-strings-equal/description/
	 * 
	 * @param s1
	 * @param s2
	 * @param x
	 * @return
	 */
	public int minOperations(String st, String sp, int x) {

		int n = st.length();
		dp = new int[n + 1][n + 1];

		for (int i[] : dp)
			Arrays.fill(i, -1);

		List<Integer> dif = new ArrayList<>();

		// Just taking the difference of the bits of both the string

		for (int i = 0; i < n; i++) {

			if (st.charAt(i) != sp.charAt(i)) {
				dif.add(i);
			}
		}

		// checking here , if the total number of difference charac. of the both string
		// is odd then return -1 as we cannot take that in the pairs.. in qus there is
		// given to take in pairs for both the cases...

		if (dif.size() % 2 == 1)
			return -1;

		return solve(dif, 0, 0, x);

	}

	private int solve(List<Integer> dif, int i, int used, int x) {

		int n = dif.size();
		if (i >= n) {
			return 0;
		}

		if (dp[i][used] != -1)
			return dp[i][used];

		int op1 = (int) (1e7);

		if (i < n - 1) {

			op1 = dif.get(i + 1) - dif.get(i) + solve(dif, i + 2, used, x);
		}

		int op2 = x + solve(dif, i + 1, used + 1, x);
		int op3 = (int) (1e7);
		if (used > 0) {
			op3 = solve(dif, i + 1, used - 1, x);
		}

		return dp[i][used] = Math.min(op1, Math.min(op2, op3));
	}
}
