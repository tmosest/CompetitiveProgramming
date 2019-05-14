package com.tmosest.competitiveprogramming.leetcode.easy;

class FindSmallestLetterGreaterThanTarget {
  /* Write code here. */

  private int[] countLetters(char[] letters) {
    int[] counts = new int[26];
    for (char c : letters) {
      counts[c - 'a']++;
    }
    return counts;
  }

  private char findSmallestLetterLargerThan(int[] counts, char target) {
    int index = target - 'a';
    for (int i = index + 1; i < counts.length; i++) {
      if (counts[i] > 0) {
        return (char) ('a' + i);
      }
    }
    for (int i = 0; i < index; i++) {
      if (counts[i] > 0) {
        return (char) ('a' + i);
      }
    }
    return ' ';
  }

  /**
   * Find next letter larger than the target.
   *
   * @param letters The letters to look through.
   * @param target The target letter.
   * @return The next largest letter.
   */
  public char nextGreatestLetter(char[] letters, char target) {
    int[] countLetters = countLetters(letters);
    return findSmallestLetterLargerThan(countLetters, target);
  }


}
