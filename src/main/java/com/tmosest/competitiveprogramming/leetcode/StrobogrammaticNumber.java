package com.tmosest.competitiveprogramming.leetcode;

public class StrobogrammaticNumber {

  /**
   * Function to determine if a number is the same upside down or not (Strobogrammatic).
   * @param num The number to check as a string.
   * @return True if it is the same upside down.
   */
  public boolean isStrobogrammatic(String num) {
    char[] numChar = num.toCharArray();
    for (int i = 0; i < numChar.length; i++) {
      if (mapStrobogrammaticNumber(numChar[i]) != numChar[numChar.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }

  private char mapStrobogrammaticNumber(char input) {
    char output;
    switch (input) {
      case '0':
      case '1':
      case '8':
        output = input;
        break;
      case '6':
        output = '9';
        break;
      case '9':
        output = '6';
        break;
      default:
        output = '-';
    }
    return output;
  }
}
