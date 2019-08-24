package com.tmosest.competitiveprogramming.leetcode.easy;

class DayOfTheYear {

  /**
   * Determine what day of the year it is.
   *
   * @param date The date in YYYY-MM-DD format.
   * @return The number day of the year.
   */
  public int dayOfYear(String date) {
    String[] str = date.split("-");
    int res = 0;
    int year = Integer.valueOf(str[0]);
    int month = Integer.valueOf(str[1]);
    int day = Integer.valueOf(str[2]);
    int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      months[1] = 29;
    }
    for (int i = 0; i < month - 1; i++) {
      res += months[i];
    }
    return res + day;
  }
}
