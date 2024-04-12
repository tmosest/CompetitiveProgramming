package com.tmosest.competitiveprogramming.leetcode.hard;

class StringTransformation {
	// time = O(n + logk), space = O(n)
	private final int mod = (int) 1e9 + 7;
	private long[][] g;
	/**
	 * https://leetcode.com/problems/string-transformation/description/
	 * 
	 * @param s
	 * @param t
	 * @param k
	 * @return
	 */
	public int numberOfWays(String s, String t, long k) {
		int n = s.length();
		int v = kmp(s + s, t);
		g = new long[][] { { v - 1, v }, { n - v, n - 1 - v } };
		long[][] f = qmi(k);
		return s.equals(t) ? (int) f[0][0] : (int) f[0][1];
	}

	private int kmp(String s, String p) {
		int n = p.length(), m = s.length();
		s = "#" + s;
		p = "#" + p;
		int[] ne = new int[n + 1];
		for (int i = 2, j = 0; i <= n; i++) {
			while (j > 0 && p.charAt(i) != p.charAt(j + 1))
				j = ne[j];
			if (p.charAt(i) == p.charAt(j + 1))
				j++;
			ne[i] = j;
		}

		int cnt = 0;
		for (int i = 1, j = 0; i <= m; i++) {
			while (j > 0 && s.charAt(i) != p.charAt(j + 1))
				j = ne[j];
			if (s.charAt(i) == p.charAt(j + 1))
				j++;
			if (j == n) {
				if (i - n + 1 <= m / 2)
					cnt++;
				j = ne[j];
			}
		}
		return cnt;
	}

	private void mul(long[][] c, long[][] a, long[][] b) {
		long[][] t = new long[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					t[i][j] = (t[i][j] + a[i][k] * b[k][j]) % mod;
				}
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = t[i][j];
			}
		}
	}

	private long[][] qmi(long k) {
		long[][] f = new long[2][2];
		f[0][0] = 1;
		while (k > 0) {
			if ((k & 1) == 1)
				mul(f, f, g);
			mul(g, g, g);
			k >>= 1;
		}
		return f;
	}
}
