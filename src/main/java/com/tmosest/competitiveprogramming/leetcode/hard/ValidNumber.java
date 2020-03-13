package com.tmosest.competitiveprogramming.leetcode.hard;

class ValidNumber {

  boolean isNumber(String str) {
    if (str.toLowerCase().contains("f") || str.toLowerCase().contains("d")) {
      return false;
    }
    try {
      Double.parseDouble(str.trim());
    } catch (Exception e) {
      return false;
    }
    return true;
  }
}
