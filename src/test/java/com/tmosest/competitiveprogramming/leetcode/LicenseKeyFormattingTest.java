package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 482. License Key Formatting")
public class LicenseKeyFormattingTest {

  LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("5F3Z-2E9W", licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("2-5G-3J", licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals("AA-AA", licenseKeyFormatting.licenseKeyFormatting("--a-a-a-a--", 2));
  }
}
