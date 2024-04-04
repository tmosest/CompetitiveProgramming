package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Stack;

class MaximumNestingDepthOfTheParentheses {
  /**
   * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
   * 
   * @param str
   * @return
   */
  public int maxDepth(String str) {
    int max = 0;
    int openings = 0;

    for (char letter : str.toCharArray()) {
      if (letter == '(') {
        openings++;
        max = Math.max(max, openings);
        continue;
      }

      if (letter == ')') {
        --openings;
        continue;
      }
    }

    return max;
  }
}
