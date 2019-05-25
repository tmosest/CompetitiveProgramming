package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 40. Combination Sum II")
class CombinationSumTwoTest {

  private CombinationSumTwo combinationSumTwo = new CombinationSumTwo();

  private void test(int[] candidates, int target, Integer[][] expected) {
    List<List<Integer>> actualList = combinationSumTwo.combinationSum2(candidates, target);
    List<List<Integer>> expectedList = new ArrayList<>();
    for (Integer[] row : expected) {
      expectedList.add(Arrays.asList(row));
    }
    Assertions.assertEquals(expectedList, actualList);
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] set = {
        10,1,2,7,6,1,5
    };
    Integer[][] expected = {
        {1, 7},
        {2, 6},
        {1, 1, 6},
        {1, 2, 5}
    };
    test(set, 8, expected);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] set = {
        2,5,2,1,2
    };
    Integer[][] expected = {
        {5},
        {1, 2, 2}
    };
    test(set, 5, expected);
  }
}
