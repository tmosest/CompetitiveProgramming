package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("number")
@Tag("easy")
@DisplayName("LeetCode: 1012. Complement of Base 10 Integer")
public class ComplementOfBaseTenIntegerTest {

  ComplementOfBaseTenInteger complementOfBaseTenInteger = new ComplementOfBaseTenInteger();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals(2, complementOfBaseTenInteger.bitwiseComplement(5));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals(0, complementOfBaseTenInteger.bitwiseComplement(7));
  }

  @Test
  @DisplayName("Test Case 2")
  void testCase2() {
    Assertions.assertEquals(5, complementOfBaseTenInteger.bitwiseComplement(10));
  }
}
