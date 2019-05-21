package com.tmosest.competitiveprogramming.leetcode.easy;

class ExcelSheetColumnTitle {
  /* Write code here. */

  /**
   * Converts a number to an excel sheet title.
   *
   * @param num The number to be converted.
   * @return The Title example: 1 -> "A".
   */
  public String convertToTitle(int num) {
    StringBuilder sb = new StringBuilder();
    int firstLetter = (int) 'A';

    int firstDigit = num / 26;
    int remainder = num % 26;

    if (firstDigit > 1 || (firstDigit > 0 && remainder != 0)) {
      if (firstDigit < 27 || (firstDigit == 27 && remainder == 0)) {
        if (remainder == 0) {
          firstDigit--;
        }
        char first = (char) (firstLetter + firstDigit - 1);
        System.out.println("firstDigit: " + firstDigit + " first: " + first);
        sb.append(first);
      } else {
        sb.append(convertToTitle(firstDigit));
      }
    }

    char second = (remainder > 0) ? (char) (firstLetter + remainder - 1) : 'Z';
    sb.append(second);

    return sb.toString();
  }


}
