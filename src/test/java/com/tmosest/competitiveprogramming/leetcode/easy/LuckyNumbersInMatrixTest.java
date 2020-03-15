package com.tmosest.competitiveprogramming.leetcode.easy;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("wc180")
@DisplayName("LeetCode: 5356. Lucky Numbers in a Matrix")
class LuckyNumbersInMatrixTest {

  private LuckyNumbersInMatrix luckyNumbersInMatrix =
      new LuckyNumbersInMatrix();

  @Test
  void testCase0() {
    int[][] input = 
        {{3,7,8},{9,11,13},{15,16,17}};

    List<Integer> expected = new ImmutableList.Builder<Integer>()
        .add(15)
        .build();

    Assertions.assertEquals(expected, luckyNumbersInMatrix.luckyNumbers(input));
  }
}
