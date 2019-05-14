package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 168. Excel Sheet Column Title")
class ExcelSheetColumnTitleTest {
	/* Write code here. */
  ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("A", excelSheetColumnTitle.convertToTitle(1));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("AB", excelSheetColumnTitle.convertToTitle(28));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("ZY", excelSheetColumnTitle.convertToTitle(701));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertEquals("ZZ", excelSheetColumnTitle.convertToTitle(702));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    Assertions.assertEquals("AZ", excelSheetColumnTitle.convertToTitle(52));
  }

  @Test
  @DisplayName("Test Case 5")
  void testCase5() {
    Assertions.assertEquals("AAA", excelSheetColumnTitle.convertToTitle(703));
  }

  @Test
  @DisplayName("Test Case 6")
  void testCase6() {
    Assertions.assertEquals("Z", excelSheetColumnTitle.convertToTitle(26));
  }


}
