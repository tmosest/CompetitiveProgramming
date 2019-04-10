package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@DisplayName("LeetCode: 537. Complex Number Multiplication")
public class ComplexNumberMultiplicationTest {

  ComplexNumberMultiplication complexNumberMultiplication = new ComplexNumberMultiplication();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertEquals("0+2i", complexNumberMultiplication.complexNumberMultiply("1+1i", "1+1i"));
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    Assertions.assertEquals("0+-2i", complexNumberMultiplication.complexNumberMultiply("1+-1i", "1+-1i"));
  }
}
