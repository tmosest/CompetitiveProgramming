package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Stack;

class MaximumNestingDepthOfTheParentheses {

  int maxDepth(String str) {
    Stack<Character> openingBrackets = new Stack<>();
    int maxSize = 0;

    for (char letter : str.toCharArray()) {
      if ('(' == letter) {
        openingBrackets.push(letter);
        maxSize = Math.max(maxSize, openingBrackets.size());
      } else if (')' == letter) {
        openingBrackets.pop();
      }
    }

    return maxSize;
  }
}
