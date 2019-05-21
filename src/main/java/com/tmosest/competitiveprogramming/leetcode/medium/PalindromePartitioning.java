package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class PalindromePartitioning {
  /* Write code here. */

  /**
   * Return a list of strings that are all palindromes.
   *
   * @param str The input.
   * @return A list of all palindrome partitions.
   */
  public List<List<String>> partition(String str) {
    List<List<String>> res = new ArrayList<>();
    helper(str, 0, new ArrayList<>(), res);
    return res;
  }

  private void helper(String str, int idx, List<String> cur, List<List<String>> res) {
    if (idx == str.length()) {
      res.add(new ArrayList<>(cur));
      return;
    }
    for (int i = idx; i < str.length(); i++) {
      String temp = str.substring(idx, i + 1);
      if (!check(temp)) {
        continue;
      }
      cur.add(temp);
      helper(str, i + 1, cur, res);
      cur.remove(cur.size() - 1);
    }
  }

  private boolean check(String str) {
    int len = 0;
    int hen = str.length() - 1;
    while (len < hen) {
      if (str.charAt(len++) != str.charAt(hen--)) {
        return false;
      }
    }
    return true;
  }


}
