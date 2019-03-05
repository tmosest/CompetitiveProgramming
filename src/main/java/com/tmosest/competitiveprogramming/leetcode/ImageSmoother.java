package com.tmosest.competitiveprogramming.leetcode;

public class ImageSmoother {

  /**
   * Smooths an image based on surrounding pixels.
   * @param matrix The matrix of pixels.
   * @return The smoothed matrix.
   */
  public int[][] imageSmoother(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] ans = new int[rows][cols];

    for (int r = 0; r < rows; ++r) {
      for (int c = 0; c < cols; ++c) {
        int count = 0;
        for (int nr = r - 1; nr <= r + 1; ++nr) {
          for (int nc = c - 1; nc <= c + 1; ++nc) {
            if (0 <= nr && nr < rows && 0 <= nc && nc < cols) {
              ans[r][c] += matrix[nr][nc];
              count++;
            }
          }
        }
        ans[r][c] /= count;
      }
    }
    return ans;
  }
}
