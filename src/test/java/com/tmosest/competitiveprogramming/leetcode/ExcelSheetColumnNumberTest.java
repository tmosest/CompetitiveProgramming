package com.tmosest.competitiveprogramming.leetcode;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 171. Excel Sheet Column Number")
public class ExcelSheetColumnNumberTest {
  ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(1, excelSheetColumnNumber.titleToNumber("A"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(28, excelSheetColumnNumber.titleToNumber("AB"));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals(701, excelSheetColumnNumber.titleToNumber("ZY"));
  }

  @Test
  @DisplayName("Test Case 3")
  void testCase3() {
    Assertions.assertEquals(702, excelSheetColumnNumber.titleToNumber("ZZ"));
  }

  @Test
  @DisplayName("Test Case 4")
  void testCase4() {
    Assertions.assertEquals(52, excelSheetColumnNumber.titleToNumber("AZ"));
  }

  @Test
  @DisplayName("Test Case 5")
  void testCase5() {
    Assertions.assertEquals(703, excelSheetColumnNumber.titleToNumber("AAA"));
  }

  @Test
  @DisplayName("Test Case 6")
  void testCase6() {
    Assertions.assertEquals(26, excelSheetColumnNumber.titleToNumber("Z"));
  }
}
