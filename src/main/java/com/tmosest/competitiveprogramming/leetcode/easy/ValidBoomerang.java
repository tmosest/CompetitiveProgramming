package com.tmosest.competitiveprogramming.leetcode.easy;

class ValidBoomerang {

  private static double UNDEFINED = Double.POSITIVE_INFINITY;

  /**
   * Determine if three points lie on the same line or not.
   *
   * @param points The three points.
   * @return True if the three points lie on the same line.
   */
  public boolean isBoomerang(int[][] points) {
    if (containsDuplicatePoint(points)) {
      return false;
    }
    return getSlope(points[0], points[1]) != getSlope(points[0], points[2]);
  }

  private boolean containsDuplicatePoint(int[][] points) {
    for (int i = 0; i < points.length; i++) {
      int[] point = points[i];
      for (int j = 0; j < points.length; j++) {
        int[] otherPoint = points[j];
        if (i != j && point[0] == otherPoint[0] && point[1] == otherPoint[1]) {
          return true;
        }
      }
    }
    return false;
  }

  private double getSlope(int[] point, int[] otherPoint) {
    double denominator = point[0] - otherPoint[0];
    if (denominator == 0d) {
      return UNDEFINED;
    }
    return (point[1] - otherPoint[1]) / denominator;
  }
}
