package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("map")
@Tag("wc222")
@Tag("dynamic")
@Tag("array")
@DisplayName("LeetCode: 1711. Count Good Meals")
class CountGoodMealsTest {

  private CountGoodMeals countGoodMeals;

  @BeforeEach
  void setup() {
    countGoodMeals = new CountGoodMeals();
  }

  private void test(int output, int[] deliciousness) {
    Assertions.assertEquals(output, countGoodMeals.countPairs(deliciousness));
  }

  @Test
  void test0() {
    test(15, new int[]{1, 1, 1, 3, 3, 3, 7});
  }
}
