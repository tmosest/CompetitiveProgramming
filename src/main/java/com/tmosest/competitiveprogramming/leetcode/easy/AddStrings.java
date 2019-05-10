package com.tmosest.competitiveprogramming.leetcode.easy;

class AddStrings {

  /**
   * Function to sum two numbers strings that are numbers.
   * @param num1 The first number string.
   * @param num2 The second number string.
   * @return The sum of the two numbers as strings.
   */
  String addStrings(String num1, String num2) {
    if (num1 == null && num2 == null) {
      return null;
    }
    if (num1 == null || num2 == null) {
      return (num1 == null) ? num2 : num1;
    }
    boolean hasCarryOver = false;
    StringBuilder sb = new StringBuilder();

    char[] num1Array = num1.toCharArray();
    char[] num2Array = num2.toCharArray();

    int minLength = Math.min(num1Array.length, num2Array.length);

    for (int i = 0; i < minLength; i++) {
      int sum = (num1Array[num1Array.length - 1 - i] - '0')
          + (num2Array[num2Array.length - 1 - i] - '0');
      if (hasCarryOver) {
        sum++;
        hasCarryOver = false;
      }
      if (sum >= 10) {
        sum -= 10;
        hasCarryOver = true;
      }
      char digit = (char)(sum + '0');
      sb.append(digit);
    }

    char[] remainder = null;
    if (num1Array.length > minLength) {
      remainder = num1Array;
    }
    if (num2Array.length > minLength) {
      remainder = num2Array;
    }
    if (remainder != null) {
      for (int i = remainder.length - minLength - 1; i >= 0; i--) {
        int sum = remainder[i] - '0';
        if (hasCarryOver) {
          sum++;
          hasCarryOver = false;
        }
        if (sum >= 10) {
          sum -= 10;
          hasCarryOver = true;
        }
        char digit = (char)(sum + '0');
        sb.append(digit);
      }
    }

    if (hasCarryOver) {
      sb.append("1");
    }

    return sb.reverse().toString();
  }
}
