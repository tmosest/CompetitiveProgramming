package com.tmosest.competitiveprogramming.leetcode.medium;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

class MinimumAreaRectangleTwo {

  double minAreaFreeRect(int[][] points) {
    int len = points.length;

    Point[] point = new Point[len];
    Set<Point> pointSet = new HashSet<>();
    for (int i = 0; i < len; ++i) {
      point[i] = new Point(points[i][0], points[i][1]);
      pointSet.add(point[i]);
    }

    double ans = Double.MAX_VALUE;
    for (int i = 0; i < len; ++i) {
      Point p1 = point[i];
      for (int j = 0; j < len; ++j) {
        if (j != i) {
          Point p2 = point[j];
          for (int k = j + 1; k < len; ++k) {
            if (k != i) {
              Point p3 = point[k];
              Point p4 = new Point(p2.x + p3.x - p1.x, p2.y + p3.y - p1.y);

              if (pointSet.contains(p4)) {
                int dot = ((p2.x - p1.x) * (p3.x - p1.x)
                    + (p2.y - p1.y) * (p3.y - p1.y));
                if (dot == 0) {
                  double area = p1.distance(p2) * p1.distance(p3);
                  if (area < ans) {
                    ans = area;
                  }
                }
              }
            }
          }
        }
      }
    }

    return ans < Double.MAX_VALUE ? ans : 0;
  }
}
