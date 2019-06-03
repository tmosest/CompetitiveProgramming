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
@DisplayName("LeetCode: 216. Combination Sum III")
class CombinationSumThreeTest {

  private CombinationSumThree combinationSumThree = new CombinationSumThree();

  private void test(int size, int target, Integer[][] expected) {
    List<List<Integer>> actualList = combinationSumThree.combinationSum3(size, target);
    List<List<Integer>> expectedList = new ArrayList<>();
    for (Integer[] row : expected) {
      expectedList.add(Arrays.asList(row));
    }
    Assertions.assertEquals(expectedList, actualList);
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[][] expected = {
        {1, 2, 4}
    };
    test(3, 7, expected);
  }
}
