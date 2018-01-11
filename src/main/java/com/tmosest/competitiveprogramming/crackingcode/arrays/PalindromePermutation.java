package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class PalindromePermutation {

  public static boolean isPalindromePermutation(String word) {
    int[] letterCounts = new int[24];
    int wordLength = 0;
    for (int c = 0; c < word.length(); c++) {
      char letter = word.charAt(c);
      if (Character.isAlphabetic(letter)) { // Only check alphabet
        letterCounts[(int) Character.toLowerCase(letter) - 'a']++;
        ++wordLength;
      }
    }
    int oddCount = 0;
    for (int  i = 0; i < letterCounts.length; i++) {
      if (letterCounts[i] % 2 == 1) {
        ++oddCount;
        if(wordLength % 2 == 0 && oddCount > 0) {
          return false;
        }
        if(wordLength % 2 == 1 && oddCount > 1) {
          return false;
        }
      }
    }
    return true;
  }

}
