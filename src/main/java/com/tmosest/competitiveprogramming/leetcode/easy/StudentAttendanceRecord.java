package com.tmosest.competitiveprogramming.leetcode.easy;

class StudentAttendanceRecord {
  /* Write code here. */

  /**
   * Determines if the student should get a valid record.
   *
   * @param record The string to check.
   * @return Cannot have more than 2 A's or more than 2 consecutive L's.
   */
  public boolean checkRecord(String record) {
    int absentCount = 0;
    for (int i = 0; i < record.length(); i++) {
      char letter = record.charAt(i);
      if (letter == 'A') {
        ++absentCount;
        if (absentCount > 1) {
          return false;
        }
      }
      if (letter == 'L' && i < record.length() - 2) {
        if (record.charAt(i + 1) == 'L' && record.charAt(i + 2) == 'L') {
          return false;
        }
      }
    }
    return true;
  }


}
