package com.tmosest.competitiveprogramming.utils.string;

public class NumberToWords {

  private static final int[] testValues = {
      1000000000, 1000000, 1000, 100, 10
  };

  private static final String[] testValueNames = {
      "Billion", "Million", "Thousand", "Hundred"
  };

  /**
   * Given an integer return the number in words.
   * @param num The number.
   * @return The string representation in words.
   */
  public static String numberToWords(int num) {
    for (int i = 0; i < testValues.length; i++) {
      int majorDigit = num / testValues[i];
      if (majorDigit > 0) {
        return getMajorName(i, num) + getTestValueName(i) + getRemainderName(i, num);
      }
    }
    return singleDigit(num);
  }

  private static String getTestValueName(int index) {
    if (index < testValueNames.length) {
      return " " + testValueNames[index];
    }
    return "";
  }

  private static String getMajorName(int index, int num) {
    int majorDigit = num / testValues[index];
    if (majorDigit == 0) {
      return "";
    }
    if (index < testValueNames.length) {
      return numberToWords(majorDigit);
    }
    if (majorDigit == 1) {
      return teens(num);
    }
    return tens(majorDigit);
  }

  private static String getRemainderName(int index, int num) {
    if (index < testValueNames.length || num >= 20) {
      int remainder = num % testValues[index];
      if (remainder > 0) {
        return " " + numberToWords(remainder);
      }
    }
    return "";
  }

  private static String tens(int tensDigit) {
    switch (tensDigit) {
      case 2:
        return "Twenty";
      case 3:
        return "Thirty";
      case 4:
        return "Forty";
      case 5:
        return "Fifty";
      case 6:
        return "Sixty";
      case 7:
        return "Seventy";
      case 8:
        return "Eighty";
      case 9:
        return "Ninety";
      default:
        return "";
    }
  }

  private static String teens(int num) {
    switch (num) {
      case 10:
        return "Ten";
      case 11:
        return "Eleven";
      case 12:
        return "Twelve";
      case 13:
        return "Thirteen";
      case 14:
        return "Fourteen";
      case 15:
        return "Fifteen";
      case 16:
        return "Sixteen";
      case 17:
        return "Seventeen";
      case 18:
        return "Eighteen";
      case 19:
        return "Nineteen";
      default:
        return "";
    }
  }

  private static String singleDigit(int num) {
    switch (num) {
      case 0:
        return "Zero";
      case 1:
        return "One";
      case 2:
        return "Two";
      case 3:
        return "Three";
      case 4:
        return "Four";
      case 5:
        return "Five";
      case 6:
        return "Six";
      case 7:
        return "Seven";
      case 8:
        return "Eight";
      case 9:
        return "Nine";
      default:
        return "";
    }
  }
}
