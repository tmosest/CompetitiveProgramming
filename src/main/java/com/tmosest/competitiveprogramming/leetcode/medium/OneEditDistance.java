package com.tmosest.competitiveprogramming.leetcode.medium;

class OneEditDistance {

  /**
   * Determine if a string is one edit distance away from another.
   *
   * @param one The first string.
   * @param two The 2nd string.
   * @return True if they are one edit distance away.
   */
  boolean isOneEditDistance(String one, String two) {
    int ns = one.length();
    int nt = two.length();

    if (ns > nt) {
      return isOneEditDistance(two, one);
    }

    if (nt - ns > 1) {
      return false;
    }

    for (int i = 0; i < ns; i++) {
      if (one.charAt(i) != two.charAt(i)) {
        if (ns == nt) {
          return one.substring(i + 1).equals(two.substring(i + 1));
        } else {
          return one.substring(i).equals(two.substring(i + 1));
        }
      }
    }
    return (ns + 1 == nt);
  }
}
