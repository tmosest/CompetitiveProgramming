package com.tmosest.competitiveprogramming.leetcode.easy;

class DetectCapital {
  /* Write code here. */

  /**
   * Determine if a word is a valid capital word or not.
   *
   * @param word The word.
   * @return True if all caps, no caps, or only first letter is a cap.
   */
  public boolean detectCapitalUse(String word) {
    int capitalCount = 0;
    for (char letter : word.toCharArray()) {
      if (Character.isUpperCase(letter)) {
        ++capitalCount;
      }
    }
    return capitalCount == 0
        || (capitalCount == 1 && Character.isUpperCase(word.charAt(0)))
        || capitalCount == word.length();
  }


}
