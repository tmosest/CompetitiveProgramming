package com.tmosest.competitiveprogramming.leetcode.easy;

class BoldWordsString {
  /* Write code here. */

  /**
   * Make string bold.
   *
   * @param words The words to bold.
   * @param str The string to bold words in.
   * @return The string with bold words.
   */
  public String boldWords(String[] words, String str) {
    int length = str.length();
    boolean[] mask = new boolean[length];
    for (int i = 0; i < length; ++i) {
      for (String word : words) {
        search:
        {
          for (int k = 0; k < word.length(); ++k) {
            if (k + i >= str.length() || str.charAt(k + i) != word.charAt(k)) {
              break search;
            }
          }

          for (int j = i; j < i + word.length(); ++j) {
            mask[j] = true;
          }
        }
      }
    }

    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < length; ++i) {
      if (mask[i] && (i == 0 || !mask[i - 1])) {
        ans.append("<b>");
      }
      ans.append(str.charAt(i));
      if (mask[i] && (i == length - 1 || !mask[i + 1])) {
        ans.append("</b>");
      }
    }
    return ans.toString();
  }


}
