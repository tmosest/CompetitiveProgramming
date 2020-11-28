package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;

class SplitStringIntoTheMaxNumberOfUniqueSubstrings {

  private int maxSplit = 0;

  int maxUniqueSplit(String str) {
    maxSplit = 0;
    helper(str, new HashSet<>());
    return maxSplit;
  }

  private void helper(String str, HashSet<String> hash) {
    for (int i = 1; i <= str.length(); i++) {
      String sub = str.substring(0, i);
      if (!hash.contains(sub)) {
        hash.add(sub);
        helper(str.substring(i), hash);
        maxSplit = Integer.max(maxSplit, hash.size());
        hash.remove(sub);
      }
    }
  }
}
