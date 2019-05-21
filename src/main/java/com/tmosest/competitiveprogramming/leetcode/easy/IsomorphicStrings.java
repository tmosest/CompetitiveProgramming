package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings {
  /* Write code here. */

  /**
   * Determines if two strings are isomorphic or not.
   *
   * @param str First string.
   * @param til Second string.
   * @return True if they are isomorphic and false otherwise.
   */
  public boolean isIsomorphic(String str, String til) {
    if (str.length() != til.length()) {
      return false;
    }
    char[] schar = str.toCharArray();
    char[] tchar = til.toCharArray();
    Map<Character, Character> smap = new HashMap<>();
    Map<Character, Character> tmap = new HashMap<>();
    for (int i = 0; i < schar.length; i++) {
      Character to = smap.get(schar[i]);
      Character from = tmap.get(tchar[i]);
      if (to == null) {
        to = tchar[i];
        smap.put(schar[i], to);
      }
      if (from == null) {
        from = schar[i];
        tmap.put(tchar[i], from);
      }
      if (to != tchar[i] || from != schar[i]) {
        return false;
      }
    }
    return true;
  }


}
