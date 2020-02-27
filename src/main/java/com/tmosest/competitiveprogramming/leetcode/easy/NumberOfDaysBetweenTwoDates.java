package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfDaysBetweenTwoDates {

  private static final int[] numOfDaysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
      30,
      31};

  int daysBetweenDates(String date1, String date2) {
    // convert to int array
    int[] dateNum1 = toInt(date1);
    int[] dateNum2 = toInt(date2);

    // count number of days till date
    int count1 = countDays(dateNum1);
    int count2 = countDays(dateNum2);

    return Math.abs(count1 - count2);
  }

  private int countDays(int[] dateNum) {
    // use 1971 as base year
    int year = 1971;
    int count = 0;
    // count days in previous years
    while (year < dateNum[0]) {
      count += isLeapYear(year) ? 366 : 365;
      year++;
    }

    // count days in previous months
    for (int i = 0; i < dateNum[1] - 1; i++) {
      count += numOfDaysInMonth[i];
    }
    count += isLeapYear(dateNum[0]) && dateNum[1] > 2 ? 1 : 0;

    // count days in current month
    count += dateNum[2];
    return count;
  }

  private int[] toInt(String date) {
    String[] dates = date.split("-");
    return new int[]{
        Integer.valueOf(dates[0]),
        Integer.valueOf(dates[1]),
        Integer.valueOf(dates[2])
    };
  }

  private boolean isLeapYear(int year) {
    return ((year % 4 == 0) && (year % 100 != 0))
        || (year % 400 == 0);
  }
}
