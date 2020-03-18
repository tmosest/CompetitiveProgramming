package com.tmosest.competitiveprogramming.leetcode.medium;

class ScoreOfParentheses {

  int scoreOfParentheses(String str) {
    int ans = 0;
    int bal = 0;
    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == '(') {
        bal++;
      } else {
        bal--;
        if (str.charAt(i - 1) == '(') {
          ans += 1 << bal;
        }
      }
    }

    return ans;
  }
}
