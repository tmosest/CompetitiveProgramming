package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("matrix")
@Tag("wc216")
@DisplayName("LeetCode: 1665. Minimum Initial Energy to Finish Tasks")
class MinimumInitialEnergyToFinishTasksTest {

  private MinimumInitialEnergyToFinishTasks minimumInitialEnergyToFinishTasks =
      new MinimumInitialEnergyToFinishTasks();

  void test(int expected, int[][] input) {
    Assertions.assertEquals(expected, minimumInitialEnergyToFinishTasks.minimumEffort(input));
  }

  @Test
  void test1() {
    test(8, new int[][]{{1, 2}, {2, 4}, {4, 8}});
  }
}
