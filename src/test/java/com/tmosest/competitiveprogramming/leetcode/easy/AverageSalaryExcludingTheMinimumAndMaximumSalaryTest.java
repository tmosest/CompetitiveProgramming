package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 1491. Average Salary Excluding the Minimum and Maximum Salary")
class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {

  private void test(int[] inputs, double output) {
    double actual = new AverageSalaryExcludingTheMinimumAndMaximumSalary().average(inputs);
    Assertions.assertTrue(actual < output + 0.00005);
    Assertions.assertTrue(actual > output - 0.00005);
  }

  @Test
  void test0() {
    test(new int[]{
        4000, 3000, 1000, 2000
    }, 2500.00000);
  }

  @Test
  void test1() {
    test(new int[]{
        1000, 2000, 3000
    }, 2000.00000);
  }

  @Test
  void test2() {
    test(new int[]{
        6000, 5000, 4000, 3000, 2000, 1000
    }, 3500.00000);
  }

  @Test
  void test3() {
    test(new int[]{
        8000, 9000, 2000, 3000, 6000, 1000
    }, 4750.00000);
  }
}
