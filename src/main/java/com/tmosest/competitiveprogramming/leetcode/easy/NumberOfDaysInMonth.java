package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfDaysInMonth {

  /**
   * Number of days in the month.
   *
   * @param year Year.
   * @param month Month.
   * @return The number of days in that month.
   */
  int numberOfDays(int year, int month) {
    return month == 2 ? 28 + (year % 4 == 0 ? 1 : 0) - (year % 100 == 0 ? (year % 400 == 0 ? 0 : 1)
        : 0) :
        31 - (month - 1) % 7 % 2;
  }
}
