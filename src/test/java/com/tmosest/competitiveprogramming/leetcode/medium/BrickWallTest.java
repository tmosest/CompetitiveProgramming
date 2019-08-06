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
@DisplayName("LeetCode: 554. Brick Wall")
class BrickWallTest {

  private BrickWall brickWall = new BrickWall();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[][] input = {
        {1,2,2,1},
        {3,1,2},
        {1,3,2},
        {2,4},
        {3,1,2},
        {1,3,1,1}
    };
    List<List<Integer>> list = new ArrayList<>();
    for (Integer[] row : input) {
      list.add(Arrays.asList(row));
    }
    Assertions.assertEquals(2, brickWall.leastBricks(list));
  }
}
