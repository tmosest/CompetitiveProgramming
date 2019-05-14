package com.tmosest.competitiveprogramming.leetcode.medium;

class ReverseWordsInString {
  /* Write code here. */

  /**
   * Reverses the words in a sentence.
   *
   * @param sentence The sentence to go through.
   * @return The sentence with the words reversed and no duplicate spaces.
   */
  public String reverseWords(String sentence) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] words = sentence.trim().split(" ");
    for (int i = words.length - 1; i >= 0; i--) {
      String wordTrimmed = words[i].trim();
      if (wordTrimmed.equals("")) {
        continue;
      }
      stringBuilder.append(words[i].trim());
      stringBuilder.append(" ");
    }
    if (stringBuilder.length() > 0) {
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    }
    return stringBuilder.toString();
  }


}
