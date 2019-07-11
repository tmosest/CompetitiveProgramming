package com.tmosest.competitiveprogramming.leetcode.medium;

class StringWithoutAaaOrBbb {

  /**
   * Returns a special string given countA and countB.
   *
   * @param countA String countA.
   * @param countB String countB.
   * @return Super special awesome string.
   */
  String strWithout3a3b(int countA, int countB) {
    StringBuilder ans = new StringBuilder();

    while (countA > 0 || countB > 0) {
      boolean writeA = false;
      int len = ans.length();
      if (len >= 2 && ans.charAt(len - 1) == ans.charAt(len - 2)) {
        if (ans.charAt(len - 1) == 'b') {
          writeA = true;
        }
      } else {
        if (countA >= countB) {
          writeA = true;
        }
      }

      if (writeA) {
        countA--;
        ans.append('a');
      } else {
        countB--;
        ans.append('b');
      }
    }

    return ans.toString();
  }
}
