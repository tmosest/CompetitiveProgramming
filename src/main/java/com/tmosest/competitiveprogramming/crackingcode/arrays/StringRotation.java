package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class StringRotation {

  /**
   * Determines if a string is a rotation of another one. Only allowed to use isSubstring method.
   *
   * @param string1 String one.
   * @param string2 String two.
   * @return True if the two strings are the same.
   */
  public static boolean isRotation(String string1, String string2) {
    if (string1.length() == string2.length() && string1.length() > 0) {
      string1 = string1 + string1;
      return string1.indexOf(string2) != -1;
    }
    return false;
  }

}
