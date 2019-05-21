package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class BinaryWatch {
  /* Write code here. */

  /**
   * Given the number of lights on return all numbers that could be represented.
   *
   * @param num The number of lights.
   * @return The times on a binary watch.
   */
  public List<String> readBinaryWatch(int num) {
    List<String> options = new ArrayList<>();
    // 10 : 4 + 6
    char[] buf = new char[10];
    // count of 1s and count 0s.
    populateOptions(num, 10 - num, buf, 0, options);
    List<String> res = new ArrayList<>();
    for (String s : options) {
      s = convertToTime(s);
      if (s != null) {
        res.add(s);
      }
    }
    return res;
  }

  private void populateOptions(int count1, int count0, char[] buf, int num, List<String> options) {
    if (num == buf.length) {
      options.add(new String(buf));
      return;
    }
    if (count1 > 0) {
      buf[num] = '1';
      populateOptions(count1 - 1, count0, buf, num + 1, options);
    }
    if (count0 > 0) {
      buf[num] = '0';
      populateOptions(count1, count0 - 1, buf, num + 1, options);
    }
  }

  private int binaryValue(String str) {
    int power = 1;
    int val = 0;
    for (char c : str.toCharArray()) {
      val += (c == '1' ? power : 0);
      power = power << 1;
    }
    return val;
  }

  private String convertToTime(String str) {
    int hour = binaryValue(str.substring(0, 4));
    int minute = binaryValue(str.substring(4));
    if (hour < 12 && minute < 60) {
      String hourStr = String.valueOf(hour);
      String minStr = String.valueOf(minute);
      if (minute < 10) {
        minStr = "0" + minStr;
      }
      return hourStr + ":" + minStr;
    }
    return null;
  }


}
