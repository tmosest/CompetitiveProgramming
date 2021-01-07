package com.tmosest.competitiveprogramming.leetcode.easy;

class DetermineIfStringHalvesAreAlike {

  boolean halvesAreAlike(String str) {
    int left = 0;
    int right = 0;

    String vowels = "aeiou";

    for (int i = 0; i < str.length() / 2; i++) {
      if (vowels.contains("" + Character.toLowerCase(str.charAt(i)))) {
        left++;
      }
    }

    for (int i = str.length() / 2; i < str.length(); i++) {
      if (vowels.contains("" + Character.toLowerCase(str.charAt(i)))) {
        right++;
      }
    }

    return left == right;
  }
}
