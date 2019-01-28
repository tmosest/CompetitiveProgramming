package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 551. Student Attendance Record I")
public class StudentAttendanceRecordTest {

  StudentAttendanceRecord studentAttendanceRecord = new StudentAttendanceRecord();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertTrue(studentAttendanceRecord.checkRecord("PPALLP"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertFalse(studentAttendanceRecord.checkRecord("PPALLL"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertFalse(studentAttendanceRecord.checkRecord("PPAAL"));
  }
}
