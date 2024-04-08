package com.tmosest.competitiveprogramming.leetcode.medium;

class ConstructProductMatrix {
	public int[][] constructProductMatrix(int[][] grid) {
		long product = 1;
		int n = grid.length;
		int m = grid[0].length;
		int[][] prefixProd = new int[n][m];
		int[][] suffixProd = new int[n][m];

		int last = 1;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				prefixProd[i][j] = (last * (grid[i][j] % 12345)) % 12345;
				last = prefixProd[i][j];
			}
		}

		last = 1;
		for (int i = n - 1; i >= 0; --i) {
			for (int j = m - 1; j >= 0; --j) {
				suffixProd[i][j] = (last * (grid[i][j] % 12345)) % 12345;
				last = suffixProd[i][j];
			}
		}

		int prefix;
		int suffix;
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				if (i == 0 && j == 0) {
					prefix = 1;
				} else if (j != 0) {
					prefix = prefixProd[i][j - 1];
				} else {
					prefix = prefixProd[i - 1][m - 1];
				}

				if (i == n - 1 && j == m - 1) {
					suffix = 1;
				} else if (j + 1 < m) {
					suffix = suffixProd[i][j + 1];
				} else {
					suffix = suffixProd[i + 1][0];
				}

				grid[i][j] = (prefix * suffix) % 12345;
			}
		}

		return grid;
	}
}
