package com.tmosest.competitiveprogramming.leetcode.easy;

class DayOfTheWeek {

  public String dayOfTheWeek(int day, int month, int year) {
    int newyear = year - 1971;
    int adddays = (newyear - 1) / 4;
    if (year == 1972 && month > 2) {
      adddays += 1;
    }
    if (month == 2 && day == 29) {
      adddays -= 1;
    }
    if (year > 1972) {
      adddays += 1;
    }
    if (year == 2100) {
      adddays--;
    }

    int[] monthdays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    String[] wk = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
    int alldays = newyear * 365 + adddays + monthdays[month - 1]
        + day;
    int wkday = alldays % 7;
    if (wkday == 0) {
      wkday = 6;
    } else {
      wkday -= 1;
    }
    return wk[wkday];
  }
}
