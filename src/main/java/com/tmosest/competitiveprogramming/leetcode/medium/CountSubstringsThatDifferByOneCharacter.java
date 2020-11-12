package com.tmosest.competitiveprogramming.leetcode.medium;

class CountSubstringsThatDifferByOneCharacter {

  int countSubstrings(String str, String tst) {
    int res = 0;
    for (int i = 0; i < str.length(); ++i) {
      for (int j = 0; j < tst.length(); ++j) {
        int miss = 0;
        for (int pos = 0; i + pos < str.length() && j + pos < tst.length(); ++pos) {
          if (str.charAt(i + pos) != tst.charAt(j + pos) && ++miss > 1) {
            break;
          }
          res += miss;
        }
      }
    }
    return res;
  }
}
