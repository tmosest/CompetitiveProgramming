package com.tmosest.competitiveprogramming.leetcode.easy;

class GoatLatin {
  /* Write code here. */

  /**
   * Turn a string to goat latin.
   *
   * @param string The string we are transforming.
   * @return Return the string in goat latin.
   */
  public String toGoatLatin(String string) {
    String[] words = string.split(" ");
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      char firstLetter = word.charAt(0);
      switch (Character.toLowerCase(firstLetter)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          break;
        default:
          word = word.substring(1, word.length()) + firstLetter;
      }
      word += "ma";
      for (int a = 0; a <= i; a++) {
        word += 'a';
      }
      words[i] = word;
    }
    return String.join(" ", words);
  }


}
