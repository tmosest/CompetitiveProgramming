package com.tmosest.competitiveprogramming.leetcode.hard;

class BestPositionForServiceCentre {

  double getMinDistSum(int[][] positions) {
    double min = Double.MAX_VALUE;

    // (x,y) is the center of the current search area,
    // delta is the distance we search from the center.
    double hor = 50;
    double vert = 50;
    double delta = 50;
    // to track the best point we found
    double minX = hor;
    double minY = vert;

    while (delta >= 10e-4) {
      //"delta/100" is the incremental step,
      // so the time cost will be 200*200 for each loop.
      for (double i = hor - delta; i <= hor + delta; i += delta / 100) {
        for (double j = vert - delta; j <= vert + delta; j += delta / 100) {
          double dist = dist(positions, i, j);
          if (dist <= min) {
            min = dist;
            minX = i;
            minY = j;
          }
        }
      }
      // reset the center for the searching area to (min_x,min_y),
      // set delta to the incremental step delta/100
      hor = minX;
      vert = minY;
      delta /= 100;
    }
    return min;
  }

  private double dist(int[][] positions, double one, double two) {
    double ans = 0;

    for (int[] p : positions) {
      double dist = Math.pow(p[0] - one, 2) + Math.pow(p[1] - two, 2);
      ans += Math.sqrt(dist);
    }

    return ans;
  }
}
