package com.tmosest.competitiveprogramming.leetcode.medium;

class NextClosestTime {
  /* Write code here. */

  /**
   * Determine the next closest time made of the same digits.
   *
   * @param time The time.
   * @return The next closest given the same digits.
   */
  public String nextClosestTime(String time) {
    String result = incrementTime(time);
    while (!containsSameTime(time, result)) {
      result = incrementTime(result);
    }
    return result;
  }

  private String incrementTime(String time) {
    StringBuilder result = new StringBuilder();
    int hours = Integer.valueOf(time.substring(0, 2));
    int minutes = Integer.valueOf(time.substring(3, 5));
    minutes++;
    if (minutes >= 60) {
      hours++;
      minutes -= 60;
    }
    if (hours >= 24) {
      hours = 0;
    }
    if (hours < 10) {
      result.append("0");
    }
    result.append(hours);
    result.append(":");
    if (minutes < 10) {
      result.append("0");
    }
    result.append(minutes);
    return result.toString();
  }

  private boolean containsSameTime(String time, String otherTime) {
    for (int i = 0; i < otherTime.length(); i++) {
      if (!time.contains(otherTime.substring(i, i + 1))) {
        return false;
      }
    }
    return true;
  }


}
