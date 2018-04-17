package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class CheckPermutation {

  /**
   * Determines if two strings are permutations of each other. O(N).
   * @param s1 First String.
   * @param s2 Second String.
   * @return True if permutations of each other.
   */
  public static boolean arePermutations(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    int[] characterCounts = new int[258];
    for (int c = 0; c < s1.length(); c++) {
      characterCounts[(int) s1.charAt(c)]++;
      characterCounts[(int) s2.charAt(c)]--;
    }
    for (int c = 0; c < characterCounts.length; c++) {
      if (characterCounts[c] != 0) {
        return false;
      }
    }
    return true;
  }

}
