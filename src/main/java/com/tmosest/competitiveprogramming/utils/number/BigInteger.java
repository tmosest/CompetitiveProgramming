package com.tmosest.competitiveprogramming.utils.number;

public class BigInteger {

  private String val = "0";

  /**
   * Create a new big integer with given value.
   * @param val The value.
   */
  public BigInteger(String val) {
    this.val = val;
  }

  /**
   * Convert to a string.
   * @return The String representation of the big integer.
   */
  public String toString() {
    return val;
  }

  /**
   * Add together two big integers.
   * @param bigInteger The big int to add.
   * @return The resulting big integer.
   */
  public BigInteger add(BigInteger bigInteger) {
    String other = bigInteger.toString();
    if (val == null && other == null) {
      return null;
    }
    if (val == null || other == null) {
      String res = (val == null) ? other : val;
      return new BigInteger(res);
    }
    boolean hasCarryOver = false;
    StringBuilder sb = new StringBuilder();
    char[] num1Array = val.toCharArray();
    char[] num2Array = other.toCharArray();
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
    return new BigInteger(sb.reverse().toString());
  }
}
