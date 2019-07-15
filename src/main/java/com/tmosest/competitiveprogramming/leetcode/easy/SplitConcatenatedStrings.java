package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

class SplitConcatenatedStrings {

  /**
   * Determine string this could be split from.
   *
   * @param strs An array of strings.
   * @return The string this could be split from.
   */
  String splitLoopedString(String[] strs) {
    Queue<String> queue = new LinkedList<>();
    String res = "";
    int row = 0;
    int col = 0;
    queue.add("");
    while (row < strs.length) {
      String temp = queue.remove();
      queue.add(temp + strs[row]);
      queue.add(temp + new StringBuffer(strs[row]).reverse().toString());
      col++;
      if (col == 1 << row) {
        row++;
        col = 0;
      }
    }
    while (!queue.isEmpty()) {
      String temp = queue.remove();
      for (int k = 0; k < temp.length(); k++) {
        String t1 = temp.substring(k) + temp.substring(0, k);
        if (t1.compareTo(res) > 0) {
          res = t1;
        }
      }
    }
    return res;
  }
}
