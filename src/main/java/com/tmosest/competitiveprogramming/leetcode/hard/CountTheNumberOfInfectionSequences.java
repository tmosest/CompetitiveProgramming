package com.tmosest.competitiveprogramming.leetcode.hard;

class CountTheNumberOfInfectionSequences {
	private static final int MOD = 1000000007;
    private static long[] fac = new long[100001];
	/**
	 * https://leetcode.com/problems/count-the-number-of-infection-sequences/
	 * 
	 * @param n
	 * @param sick
	 * @return
	 */
	public int numberOfSequence(int n, int[] sick) {
        int m = sick.length;
        long ans = 1;
        if (sick[0] > 0) {
            ans = (ans * invMod(myFac(sick[0]))) % MOD;
        }
        if (sick[m - 1] < n - 1) {
            ans = (ans * invMod(myFac(n - 1 - sick[m - 1]))) % MOD;
        }
        int sum = n - m;
        ans = (ans * myFac(sum)) % MOD;
        for (int i = 1; i < m; i++) {
            int curr = sick[i] - sick[i - 1] - 1;
            if (curr == 0) {
                continue;
            }
            ans = (ans * myPow(2, curr - 1)) % MOD;
            ans = (ans * invMod(myFac(curr))) % MOD;
        }
        return (int)ans;
    }

	private long invMod(long x) {
        return myPow(x, MOD - 2);
    }

	private long myFac(int n) {
        if (fac[n] > 0) {
            return fac[n];
        }
        long ans = 1;
        for (int i = n; i >= 2; i--) {
            if (fac[i] > 0) {
                ans = (ans * fac[i]) % MOD;
                break;
            }
            ans = (ans * i) % MOD;
        }
        fac[n] = ans;
        return ans;
    }

	private long myPow(long x, int y) {
        long res = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % MOD;
            }
            x = (x * x) % MOD;
            y /= 2;
        }
        return res;
    }
}
