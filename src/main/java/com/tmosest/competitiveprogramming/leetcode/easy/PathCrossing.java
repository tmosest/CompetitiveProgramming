package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class PathCrossing {

  private static class Point {
    int row = 0;
    int col = 0;

    private Point() {}

    private void goNorth() {
      row += 1;
    }

    private void goSouth() {
      row -= 1;
    }

    private void goEast() {
      col += 1;
    }

    private void goWest() {
      col -= 1;
    }

    public String toString() {
      return row + "," + col;
    }
  }

  boolean isPathCrossing(String path) {
    Set<String> points = new HashSet<>();
    Point point = new Point();
    points.add(point.toString());
    for (char letter : path.toCharArray()) {
      switch (letter) {
        case 'N':
          point.goNorth();
          break;
        case 'S':
          point.goSouth();
          break;
        case 'E':
          point.goEast();
          break;
        default:
          point.goWest();
      }
      String placement = point.toString();
      if (points.contains(placement)) {
        return true;
      }
      points.add(placement);
    }
    return false;
  }
}
