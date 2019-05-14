package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class LetterCasePermutation {
  /* Write code here. */

  /**
   * Find permutations of cases.
   *
   * @param str The input string.
   * @return A list of permutations.
   */
  public List<String> letterCasePermutation(String str) {
    List<StringBuilder> ans = new ArrayList<>();
    ans.add(new StringBuilder());

    for (char c : str.toCharArray()) {
      int num = ans.size();
      if (Character.isLetter(c)) {
        for (int i = 0; i < num; ++i) {
          ans.add(new StringBuilder(ans.get(i)));
          ans.get(i).append(Character.toLowerCase(c));
          ans.get(num + i).append(Character.toUpperCase(c));
        }
      } else {
        for (int i = 0; i < num; ++i) {
          ans.get(i).append(c);
        }
      }
    }

    List<String> finalans = new ArrayList();
    for (StringBuilder sb : ans) {
      finalans.add(sb.toString());
    }
    return finalans;
  }


}
