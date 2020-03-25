package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("dynamic")
@DisplayName("LeetCode: 1319. Number of Operations to Make Network Connected")
class NumberOfOperationsToMakeNetworkConnectedTest {

  private NumberOfOperationsToMakeNetworkConnected numberOfOperationsToMakeNetworkConnected =
      new NumberOfOperationsToMakeNetworkConnected();

  @Test
  void testCase0() {
    Assertions.assertEquals(1,
        numberOfOperationsToMakeNetworkConnected.makeConnected(
            4,
            new int[][]{
                {0, 1}, {0, 2}, {1, 2}
            }
        ));
  }
}
