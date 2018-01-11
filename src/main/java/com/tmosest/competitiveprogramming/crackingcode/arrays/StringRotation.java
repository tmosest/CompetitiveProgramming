package com.tmosest.competitiveprogramming.crackingcode.arrays;

public class StringRotation {

  public static boolean isRotation(String string1, String string2) {
    string1 = string1 + string1;
    return string1.indexOf(string2) != -1;
  }

}
