package com.tmosest.competitiveprogramming.leetcode;

public class LargestTriangleArea {

  /**
   * Find the largest area of a triangle given points.
   * @param points A matrix of points.
   * @return The largest area.
   */
  public double largestTriangleArea(int[][] points) {
    int length = points.length;
    double ans = 0;
    for (int i = 0; i < length; ++i) {
      for (int j = i + 1; j < length; ++j) {
        for (int k = j + 1; k < length; ++k) {
          ans = Math.max(ans, area(points[i], points[j], points[k]));
        }
      }
    }
    return ans;
  }

  private double area(int[] base, int[] height, int[] length) {
    return 0.5 * Math.abs(base[0] * height[1] + height[0] * length[1] + length[0] * base[1]
        - base[1] * height[0] - height[1] * length[0] - length[1] * base[0]);
  }
}
