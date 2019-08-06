package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class MinimumAreaRectangle {

  /**
   * Determine the minimum area of the rectangle that can be made.
   *
   * @param points The points.
   * @return The area of min rect.
   */
  int minAreaRect(int[][] points) {
    Map<Integer, List<Integer>> rows = new TreeMap<>();
    for (int[] point : points) {
      int xpoint = point[0];
      int ypoint = point[1];
      rows.computeIfAbsent(xpoint, z -> new ArrayList<>()).add(ypoint);
    }

    int ans = Integer.MAX_VALUE;
    Map<Integer, Integer> lastx = new HashMap<>();
    for (int x : rows.keySet()) {
      List<Integer> row = rows.get(x);
      Collections.sort(row);
      for (int i = 0; i < row.size(); ++i) {
        for (int j = i + 1; j < row.size(); ++j) {
          int y1 = row.get(i);
          int y2 = row.get(j);
          int code = 40001 * y1 + y2;
          if (lastx.containsKey(code)) {
            ans = Math.min(ans, (x - lastx.get(code)) * (y2 - y1));
          }
          lastx.put(code, x);
        }
      }
    }

    return ans < Integer.MAX_VALUE ? ans : 0;
  }
}
