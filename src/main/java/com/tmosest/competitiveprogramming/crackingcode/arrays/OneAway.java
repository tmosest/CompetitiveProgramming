package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class OneAway {

  /**
   * Determines if one string is one insert, delete, or replace away from the other.
   *
   * @param string1 String one.
   * @param string2 String two.
   * @return True if they are <= 1 move different.
   */
  public static boolean isOneAway(String string1, String string2) {
    // Cant insert enough characters to make them match anyway!
    if (Math.abs(string1.length() - string2.length()) > 1) {
      return false;
    }
    int[] letterCounts = new int[258];
    for (int c = 0; c < string1.length(); c++) {
      letterCounts[(int) string1.charAt(c)]++;
    }
    for (int c = 0; c < string2.length(); c++) {
      letterCounts[(int) string2.charAt(c)]--;
    }
    int count = 0;
    for (int i = 0; i < letterCounts.length; i++) {
      if (letterCounts[i] != 0) {
        ++count;
        if (count > 1 && string1.length() != string2.length()) {
          return false;
        }
        if (count > 2 && string1.length() == string2.length()) {
          return false;
        }
      }
    }
    return true;
  }

}
