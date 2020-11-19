package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class LexicographicallySmallestStringAfterApplyingOperations {

  String findLexSmallestString(String str, int one, int two) {
    int len = str.length();
    String smallest = str;
    Queue<String> queue = new LinkedList<>();
    queue.offer(str);
    Set<String> seen = new HashSet<>(queue);
    while (!queue.isEmpty()) {
      String cur = queue.poll();
      if (smallest.compareTo(cur) > 0) {
        smallest = cur;
      }
      char[] ca = cur.toCharArray();
      for (int i = 1; i < ca.length; i += 2) {
        ca[i] = (char) ((ca[i] - '0' + one) % 10 + '0');
      }
      String addA = String.valueOf(ca);
      if (seen.add(addA)) {
        queue.offer(addA);
      }
      String rotate = cur.substring(len - two) + cur.substring(0, len - two); // rotation.
      if (seen.add(rotate)) {
        queue.offer(rotate);
      }
    }
    return smallest;
  }
}
