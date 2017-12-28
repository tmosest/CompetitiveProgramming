package com.tmosest.competitiveprogramming.crackingcode.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.tmosest.competitiveprogramming.crackingcode.dynamic.Stairs;

@DisplayName("Cracking The Code Interview Dynamic Programming Q1: Stairs")
class StairsTest {

  @Test
  @DisplayName("Test Case: height 1")
  void testCase0() {
    int input = 1;
    int output = 1;
    Assertions.assertEquals(output, Stairs.solve(input));
  }

  @Test
  @DisplayName("Test Case: height 2")
  void testCase1() {
    int input = 2;
    int output = 2;
    Stairs.debugMode = false;
    Assertions.assertEquals(output, Stairs.solve(input));
  }

  @Test
  @DisplayName("Test Case: height 3")
  void testCase2() {
    int input = 3;
    int output = 4;
    Stairs.debugMode = false;
    Assertions.assertEquals(output, Stairs.solve(input));
  }

  @Test
  @DisplayName("Test Case: height 4")
  void testCase3() {
    int input = 4;
    int output = 8;
    Stairs.debugMode = false;
    Assertions.assertEquals(output, Stairs.solve(input));
  }

}
