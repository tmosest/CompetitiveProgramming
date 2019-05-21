package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Comparator;
import java.util.PriorityQueue;

class KClosestPointsToOrigin {
  /* Write code here. */

  /**
   * Get a certain number of closest points.
   *
   * @param points The points as a matrix.
   * @param numberOfPoints The number of points to get.
   * @return A matrix of points.
   */
  public int[][] numClosest(int[][] points, int numberOfPoints) {
    PriorityQueue<Point> pq = new PriorityQueue<Point>(10, new Comparator<Point>() {
      public int compare(Point point1, Point point2) {
        return Integer.compare(point1.dist, point2.dist);
      }
    });
    for (int i = 0; i < points.length; i++) {
      Point point = new Point(points[i]);
      pq.add(point);
    }
    int[][] result = new int[numberOfPoints][2];
    for (int i = 0; i < numberOfPoints; i++) {
      result[i] = pq.poll().cord;
    }
    return result;
  }

  class Point {

    int[] cord;
    int dist;

    public Point(int[] cord) {
      this.cord = cord;
      dist = cord[0] * cord[0] + cord[1] * cord[1];
    }
  }


}
