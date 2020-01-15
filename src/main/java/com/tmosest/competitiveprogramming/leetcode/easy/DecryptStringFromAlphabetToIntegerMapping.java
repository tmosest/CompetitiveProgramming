package com.tmosest.competitiveprogramming.leetcode.easy;

class DecryptStringFromAlphabetToIntegerMapping {

  String freqAlphabets(String str) {
    StringBuilder res = new StringBuilder();
    char[] letters = str.toCharArray();
    for (int i = 0; i < letters.length; i++) {
      int num = letters[i] - '0';
      if (i < letters.length - 2 && letters[i + 2] == '#') {
        num = num * 10 + (letters[i + 1] - '0');
        i += 2;
      }
      res.append((char) (num + 'a' - 1));
    }
    return res.toString();
  }
}
