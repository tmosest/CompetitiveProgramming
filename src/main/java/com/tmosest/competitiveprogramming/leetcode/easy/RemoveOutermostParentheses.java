package com.tmosest.competitiveprogramming.leetcode.easy;

class RemoveOutermostParentheses {
  /* Write code here. */

  /**
   * Remove the outermost pair of parentheses.
   *
   * @param parentheses The parentheses.
   * @return The part with the outer ones take off.
   */
  public String removeOuterParentheses(String parentheses) {
    int openCount = 0;
    int closeCount = 0;
    StringBuilder temp = new StringBuilder();
    StringBuilder result = new StringBuilder();
    for (char letter : parentheses.toCharArray()) {
      if (letter == '(') {
        ++openCount;
        temp.append('(');
      } else {
        ++closeCount;
        temp.append(')');
        if (openCount == closeCount) {
          openCount = 0;
          closeCount = 0;
          temp.deleteCharAt(0);
          temp.deleteCharAt(temp.length() - 1);
          result.append(temp);
          temp = new StringBuilder();
        }
      }
    }
    return result.toString();
  }


}
