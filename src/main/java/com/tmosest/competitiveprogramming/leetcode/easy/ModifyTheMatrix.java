package com.tmosest.competitiveprogramming.leetcode.easy;

class ModifyTheMatrix {
	/**
	 * https://leetcode.com/contest/weekly-contest-384/problems/modify-the-matrix/
	 * @param matrix
	 * @return
	 */
	public int[][] modifiedMatrix(int[][] matrix) {
		int[][] result = new int[matrix.length][matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				result[i][j] = matrix[i][j];
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (result[i][j] == -1) {
					int max = Integer.MIN_VALUE;
					for (int c = 0; c < matrix.length; c++) {
						max = Math.max(max, result[c][j]);
					}
					result[i][j] = max;
				}
			}
		}

		return result;
	}
}
