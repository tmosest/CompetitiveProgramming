package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumNumberOfVowelsInSubstringOfGivenLength {

  int maxVowels(String str, int len) {
    int max = 0;
    int count = 0;
    String vowel = "aeiou";
    for (int i = 0; i < str.length(); i++) {
      count += vowel.indexOf(str.charAt(i)) > -1 ? 1 : 0;
      count -= i >= len && vowel.indexOf(str.charAt(i - len)) > -1 ? 1 : 0;
      max = count > max ? count : max;
    }
    return max;
  }
}
