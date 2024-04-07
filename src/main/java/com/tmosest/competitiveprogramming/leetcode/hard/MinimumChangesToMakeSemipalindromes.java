package com.tmosest.competitiveprogramming.leetcode.hard;

class MinimumChangesToMakeSemipalindromes {
	private int[][] memo_s = new int[201][201];
    private Integer[][] dp = new Integer[201][101];
	/**
	 * https://leetcode.com/problems/minimum-changes-to-make-k-semi-palindromes/description/
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public int minimumChanges(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            for (int len = 2; i + len <= s.length(); len++) {
                memo_s[i][len] = Integer.MAX_VALUE;
                for (int d = 1; d <= len / 2 && memo_s[i][len] > 0; d++) {
                    if (len % d > 0) {
                        continue;
                    }
                    int res_d = 0;
                    for (int offset = 0; offset < d; offset++) {
                        int l = i + offset;
                        int r = l + len - d;
                        while (l < r) {
                            res_d += (s.charAt(l) != s.charAt(r)) ? 1 : 0;
                            l += d;
                            r -= d;
                        }
                    }
                    memo_s[i][len] = Math.min(memo_s[i][len], res_d);
                }
            }
        }

        return dfs(0, k, s);
    }

	public int dfs(int start, int k, String s) {        
        if (k == 1) {
            return memo_s[start][s.length()-start];
        }
        

        if (dp[start][k] != null) {
            return dp[start][k];
        }

        dp[start][k] = 10000;
        for (int j = start+2; j < (s.length()-1); j++) {
            dp[start][k] = Math.min(dp[start][k], memo_s[start][j-start] + dfs(j, k-1, s));
        }
        return dp[start][k];
    }
}
