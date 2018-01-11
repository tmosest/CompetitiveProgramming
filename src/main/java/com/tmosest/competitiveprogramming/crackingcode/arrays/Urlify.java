package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class Urlify {

  /**
   * Function to convert a string into a url by turning ' ' into '%20'. O(N) Complexity. O(1) Space.
   * @param word
   * @return
   */
  public static String urlify(char[] word) {
    int realIndex = word.length;
    for (int c = word.length - 1; c >= 0; c--) {
      if (word[c] == ' ' && realIndex != word.length) {
        word[--realIndex] = '0';
        word[--realIndex] = '2';
        word[--realIndex] = '%';
      } else if(word[c] != ' ') {
        word[--realIndex] = word[c];
      }
    }
    return String.valueOf(word);
  }
}
