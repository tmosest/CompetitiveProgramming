package com.tmosest.competitiveprogramming.leetcode.easy;

class ReverseWordsStringThree {
  /* Write code here. */

  /**
   * Reverse the words in a sentence but preserve white space.
   *
   * @param sentence The sentence to reverse.
   * @return Reversed sentence.
   */
  public String reverseWords(String sentence) {
    char[] sentenceArray = sentence.toCharArray();
    int start = -1;
    int end = -1;
    while (start < sentence.length() && end < sentence.length()) {
      start = findCharacter(sentenceArray, end + 1);
      if (start == -1) {
        break;
      }
      end = findSpace(sentenceArray, start + 1);
      if (end == -1) {
        end = sentence.length();
      }
      end--;
      reverse(sentenceArray, start, end);
    }
    return new String(sentenceArray);
  }

  private void reverse(char[] str, int left, int right) {
    while (left < right) {
      char temp = str[left];
      str[left] = str[right];
      str[right] = temp;
      left++;
      right--;
    }
  }

  private int findCharacter(char[] str, int start) {
    for (int i = start; i < str.length; i++) {
      if (str[i] != ' ') {
        return i;
      }
    }
    return -1;
  }

  private int findSpace(char[] str, int start) {
    for (int i = start; i < str.length; i++) {
      if (str[i] == ' ') {
        return i;
      }
    }
    return -1;
  }


}
