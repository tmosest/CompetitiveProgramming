package com.tmosest.competitiveprogramming.leetcode.easy;

class MatrixSimilarityAfterCyclicShifts {
	/**
	 * https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/description/
	 * 
	 * @param mat
	 * @param k
	 * @return
	 */
	public boolean areSimilar(int[][] mat, int k) {

		for (int i = 0; i < mat.length; i++) {
			int[] newRow = new int[mat[i].length];

			for (int j = 0; j < mat[i].length; j++) {
				int shift = k;
				if (i % 2 == 1) {
					shift *= -1;
				}
				int index = (j + shift) % mat[i].length;
				if (index < 0) {
					index = mat[i].length + index;
				}
				newRow[index] = mat[i][j];
			}

			for (int j = 0; j < mat[i].length; j++) {
				if (newRow[j] != mat[i][j]) {
					return false;
				}
			}
		}

		return true;
	}
}
