package com.tmosest.competitiveprogramming.leetcode;

public class FloodFill {

  /**
   * Flood fill an image using DFS.
   * @param image An array of pixel colors.
   * @param sr The source row.
   * @param sc The source column.
   * @param newColor The new color to set to.
   * @return An array of changed pixels.
   */
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if (image == null || image.length == 0 || image[0] == null || image[0].length == 0) {
      return image;
    }
    if (sr < 0 || sc < 0
        || sr >= image.length || sc >= image[0].length
        || image[sr][sc] == newColor
        ) {
      return image;
    }
    int oldColor = image[sr][sc];
    dfs(image, sr, sc, newColor, oldColor);
    return image;
  }

  private void dfs(int[][] image, int row, int col, int newColor, int oldColor) {
    if (row < 0 || col < 0 || row >= image.length || col >= image[0].length) {
      return;
    }
    if (image[row][col] != oldColor) {
      return;
    }
    image[row][col] = newColor;
    dfs(image, row + 1, col, newColor, oldColor);
    dfs(image, row - 1, col, newColor, oldColor);
    dfs(image, row, col + 1, newColor, oldColor);
    dfs(image, row , col - 1, newColor, oldColor);
  }
}
